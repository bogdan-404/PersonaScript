import sys
from LexerPesonaScript import Lexer
from ParserPersonaScript import Parser
from CommitCreator import Commit
from CommitRunner import CommitRunner
from ErrorListener import check_for_syntax_error

api_key = "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"


def read_txt_file(file_path):
    with open(file_path, 'r') as file:
        content = file.read()
    return content


def main():
    if len(sys.argv) < 2:
        print("Usage: python runner.py <path-to-your-txt-file>")
        sys.exit(1)

    txt_file_path = sys.argv[1]
    code = read_txt_file(txt_file_path)

    # check_for_syntax_error(txt_file_path)

    lexer = Lexer()
    tokens = lexer.tokenize(code)
    # print(tokens)


    parser = Parser(tokens)
    parsed_result = parser.parse()
    # print(parsed_result)

    prompt = Commit(parsed_result)
    prompt = prompt.process()
    # print(prompt)

    dialog_runner = CommitRunner(api_key, prompt)
    dialog_runner.run_dialog()


if __name__ == "__main__":
    main()
