from LexerPesonaScript import Lexer
from ParserPersonaScript import Parser

code = '''
Description {
    name="John"
    type="NPC"
    mbti="intj"
    role="protagonist"
    background="John is a witch hunter"
}
Setting {
    type="game"
    category="adventure, magic, open-world"
    background="A world similar to Mars, where witches are living in forests and fight with humans"
}
Response {
    length=300
    prompt="I need the background story of the character. Add some info about family. Give 3 possible stories in which John is side character"
}'''

lexer = Lexer()
tokens = lexer.tokenize(code)
print(tokens)
print("================")
parser = Parser(tokens)
parsed_result = parser.parse()
print(parsed_result)
