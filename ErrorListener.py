from antlr4 import *
from ANTLR.PersonaScriptLexer import PersonaScriptLexer
from ANTLR.PersonaScriptParser import PersonaScriptParser
from antlr4.error.ErrorListener import ErrorListener

class MyErrorListener(ErrorListener):
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        raise Exception("ERROR: when parsing line %d column %d: %s\n" % \
                        (line, column, msg))

def check_for_syntax_error(argv):
    error_listener = MyErrorListener()
    input_stream = FileStream(argv)
    lexer = PersonaScriptLexer(input_stream)
    lexer.removeErrorListeners()
    lexer.addErrorListener(error_listener)
    stream = CommonTokenStream(lexer)
    parser = PersonaScriptParser(stream)
    parser.removeErrorListeners()
    parser.addErrorListener(error_listener)
    tree = parser.program()
