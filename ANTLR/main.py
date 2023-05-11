import sys
from antlr4 import *
from PersonaScriptLexer import PersonaScriptLexer
from PersonaScriptParser import PersonaScriptParser
from PersonaScriptListener import PersonaScriptListener


class KeyPrinter(PersonaScriptListener):
    def exitKey(self, ctx):
        print("Oh, a key!")


def main(argv):
    input_stream = FileStream(argv[1])
    lexer = PersonaScriptLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = PersonaScriptParser(stream)
    tree = parser.startRule()
    printer = KeyPrinter()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)


if __name__ == '__main__':
    main(sys.argv)

