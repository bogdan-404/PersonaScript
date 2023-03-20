import re

tokens = [
    'DESCRIPTION', 'SETTING', 'RESPONSE', 'NAME', 'TYPE', 'MBTI', 'ROLE',
    'BACKGROUND', 'CATEGORY', 'LENGTH', 'PROMPT', 'STRING_LITERAL', 'NUMBER_LITERAL',
    'LEFT_BRACE', 'RIGHT_BRACE', 'EQUALS', 'LEFT_SQUARE_BRACKET', 'RIGHT_SQUARE_BRACKET', 'COMMA', 'SEMICOLON',
]

description_regex = r'Description\s*\{'
setting_regex = r'Setting\s*\{'
response_regex = r'Response\s*\{'
name_regex = r'name\s*='
type_regex = r'type\s*='
mbti_regex = r'mbti\s*='
role_regex = r'role\s*='
background_regex = r'background\s*='
category_regex = r'category\s*='
length_regex = r'length\s*='
prompt_regex = r'prompt\s*='
number_literal_regex = r'\d+'
left_brace_regex = r'{'
right_brace_regex = r'}'
equals_regex = r'='
left_square_bracket_regex = r'\['
right_square_bracket_regex = r'\]'
comma_regex = r','
semicolon_regex = r';'
backslash_regex = r'\\'
string_literal_regex = r'"([^"\\]|\\.)*"|[^;{=}\[\]]+'

# Combine all regular expressions into a single pattern
token_regex = '|'.join([
    description_regex, setting_regex, response_regex, name_regex, type_regex,
    mbti_regex, role_regex, background_regex, category_regex, length_regex, prompt_regex,
    string_literal_regex, number_literal_regex, left_brace_regex, right_brace_regex,
    equals_regex, left_square_bracket_regex, right_square_bracket_regex, comma_regex, semicolon_regex, backslash_regex
])
pattern = re.compile(token_regex)


def tokenize(code):
    tokens = []
    for match in pattern.finditer(code):
        value = match.group()
        if re.match(description_regex, value):
            tokens.append(('DESCRIPTION', None))
        elif re.match(setting_regex, value):
            tokens.append(('SETTING', None))
        elif re.match(response_regex, value):
            tokens.append(('RESPONSE', None))
        elif re.match(name_regex, value):
            tokens.append(('NAME', None))
        elif re.match(type_regex, value):
            tokens.append(('TYPE', None))
        elif re.match(mbti_regex, value):
            tokens.append(('MBTI', None))
        elif re.match(role_regex, value):
            tokens.append(('ROLE', None))
        elif re.match(background_regex, value):
            tokens.append(('BACKGROUND', None))
        elif re.match(category_regex, value):
            tokens.append(('CATEGORY', None))
        elif re.match(length_regex, value):
            tokens.append(('LENGTH', None))
        elif re.match(prompt_regex, value):
            tokens.append(('PROMPT', None))
        elif re.match(string_literal_regex, value):
            if value.startswith('"') and value.endswith('"'):
                tokens.append(('STRING_LITERAL', value[1:-1]))
            else:
                tokens.append(('STRING_LITERAL', value.strip()))
        elif re.match(number_literal_regex, value):
            tokens.append(('NUMBER_LITERAL', int(value)))
        elif re.match(left_brace_regex, value):
            tokens.append(('LEFT_BRACE', None))
        elif re.match(right_brace_regex, value):
            tokens.append(('RIGHT_BRACE', None))
        elif re.match(equals_regex, value):
            tokens.append(('EQUALS', None))
        elif re.match(left_square_bracket_regex, value):
            tokens.append(('LEFT_SQUARE_BRACKET', None))
        elif re.match(right_square_bracket_regex, value):
            tokens.append(('RIGHT_SQUARE_BRACKET', None))
        elif re.match(comma_regex, value):
            tokens.append(('COMMA', None))
        elif re.match(semicolon_regex, value):
            tokens.append(('SEMICOLON', None))
        elif re.match(backslash_regex, value):
            tokens.append(('BACKSLASH', None))
    return tokens


code = '''
Description {
    name=John;
    type=NPC;
    mbti=intj;
    role=protagonist;
    background=John is a witch hunter;
}
Setting {
    type=game;
    category=adventure, magic, open-world;
    background=A world similar to Mars, where witches are living in forests and fight with humans;
}
Response {
    length=300;
    prompt=I need the background story of the character. Add some info about family. Give 3 possible stories in which John is side character;
}
'''

tokens = tokenize(code)
print(tokens)
