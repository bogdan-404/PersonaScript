import sys
from OwnTools.LexerPesonaScript import Lexer
from OwnTools.ParserPersonaScript import Parser
from OwnTools.PromptCreator import Prompt
from OwnTools.DialogRunner import DialogRunner
from ErrorListener import check_for_syntax_error

api_key = ""


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

    check_for_syntax_error(txt_file_path)

    lexer = Lexer()
    tokens = lexer.tokenize(code)

    parser = Parser(tokens)
    parsed_result = parser.parse()

    prompt = Prompt(parsed_result)
    prompt = prompt.process()

    dialog_runner = DialogRunner(api_key, prompt)
    dialog_runner.run_dialog()


if __name__ == "__main__":
    main()
