import re


class Lexer:
    def __init__(self):
        self.tokens = [
            'DESCRIPTION', 'SETTING', 'RESPONSE', 'NAME', 'TYPE', 'MBTI', 'ROLE',
            'BACKGROUND', 'CATEGORY', 'LENGTH', 'PROMPT', 'STRING_LITERAL', 'NUMBER_LITERAL',
            'LEFT_BRACE', 'RIGHT_BRACE', 'EQUALS', 'LEFT_SQUARE_BRACKET', 'RIGHT_SQUARE_BRACKET',
        ]
        self.description_regex = r'Description\s*'
        self.setting_regex = r'Setting\s*'
        self.response_regex = r'Response\s*'
        self.name_regex = r'name\s*'
        self.type_regex = r'type\s*'
        self.mbti_regex = r'mbti\s*'
        self.role_regex = r'role\s*'
        self.background_regex = r'background\s*'
        self.category_regex = r'category\s*'
        self.length_regex = r'length\s*'
        self.prompt_regex = r'prompt\s*'
        self.number_literal_regex = r'\d+'
        self.left_brace_regex = r'{'
        self.right_brace_regex = r'}'
        self.equals_regex = r'='
        self.left_square_bracket_regex = r'\['
        self.right_square_bracket_regex = r'\]'
        self.string_literal_regex = r'"([^"\\]|\\.)*"'
        self.token_regex = '|'.join([
            self.description_regex, self.setting_regex, self.response_regex, self.name_regex, self.type_regex,
            self.mbti_regex, self.role_regex, self.background_regex, self.category_regex, self.length_regex, self.prompt_regex,
            self.string_literal_regex, self.number_literal_regex, self.left_brace_regex, self.right_brace_regex,
            self.equals_regex, self.left_square_bracket_regex, self.right_square_bracket_regex
        ])
        self.pattern = re.compile(self.token_regex)

    def tokenize(self, code):
        tokens = []
        for match in self.pattern.finditer(code):
            value = match.group()
            if re.match(self.description_regex, value):
                tokens.append(('DESCRIPTION', None))
            elif re.match(self.setting_regex, value):
                tokens.append(('SETTING', None))
            elif re.match(self.response_regex, value):
                tokens.append(('RESPONSE', None))
            elif re.match(self.name_regex, value):
                tokens.append(('NAME', None))
            elif re.match(self.type_regex, value):
                tokens.append(('TYPE', None))
            elif re.match(self.mbti_regex, value):
                tokens.append(('MBTI', None))
            elif re.match(self.role_regex, value):
                tokens.append(('ROLE', None))
            elif re.match(self.background_regex, value):
                tokens.append(('BACKGROUND', None))
            elif re.match(self.category_regex, value):
                tokens.append(('CATEGORY', None))
            elif re.match(self.length_regex, value):
                tokens.append(('LENGTH', None))
            elif re.match(self.prompt_regex, value):
                tokens.append(('PROMPT', None))
            elif re.match(self.number_literal_regex, value):
                tokens.append(('NUMBER_LITERAL', int(value)))
            elif re.match(self.left_brace_regex, value):
                tokens.append(('LEFT_BRACE', None))
            elif re.match(self.right_brace_regex, value):
                tokens.append(('RIGHT_BRACE', None))
            elif re.match(self.equals_regex, value):
                tokens.append(('EQUALS', None))
            elif re.match(self.left_square_bracket_regex, value):
                tokens.append(('LEFT_SQUARE_BRACKET', None))
            elif re.match(self.right_square_bracket_regex, value):
                tokens.append(('RIGHT_SQUARE_BRACKET', None))
            elif re.match(self.string_literal_regex, value):
                if value.startswith('"') and value.endswith('"'):
                    tokens.append(('STRING_LITERAL', value[1:-1]))
                else:
                    tokens.append(('STRING_LITERAL', value.strip()))
        return tokens
