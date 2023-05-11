class Parser:
    def __init__(self, tokens):
        self.tokens = tokens
        self.current_token = 0

    def consume_token(self):
        self.current_token += 1

    def parse(self):
        elements = []
        while self.current_token < len(self.tokens):
            token, _ = self.tokens[self.current_token]
            if token == 'DESCRIPTION':
                elements.append(self.parse_description())
            elif token == 'SETTING':
                elements.append(self.parse_setting())
            elif token == 'RESPONSE':
                elements.append(self.parse_response())
            else:
                raise ValueError(f"Unexpected token '{token}'")
        return elements

    def parse_description(self):
        attributes = {}
        self.consume_token()  # Consume 'DESCRIPTION'
        self.consume_token()  # Consume 'LEFT_BRACE'
        while self.tokens[self.current_token][0] != 'RIGHT_BRACE':
            key, value = self.parse_attribute()
            attributes[key] = value
        self.consume_token()  # Consume 'RIGHT_BRACE'
        return {'type': 'description', 'attributes': attributes}

    def parse_setting(self):
        attributes = {}
        self.consume_token()  # Consume 'SETTING'
        self.consume_token()  # Consume 'LEFT_BRACE'
        while self.tokens[self.current_token][0] != 'RIGHT_BRACE':
            key, value = self.parse_attribute()
            attributes[key] = value
        self.consume_token()  # Consume 'RIGHT_BRACE'
        return {'type': 'setting', 'attributes': attributes}

    def parse_response(self):
        attributes = {}
        self.consume_token()  # Consume 'RESPONSE'
        self.consume_token()  # Consume 'LEFT_BRACE'
        while self.tokens[self.current_token][0] != 'RIGHT_BRACE':
            key, value = self.parse_attribute()
            attributes[key] = value
        self.consume_token()  # Consume 'RIGHT_BRACE'
        return {'type': 'response', 'attributes': attributes}

    def parse_attribute(self):
        key_token, _ = self.tokens[self.current_token]
        self.consume_token()  # Consume key token
        self.consume_token()  # Consume 'EQUALS'
        _, value = self.tokens[self.current_token]
        self.consume_token()  # Consume value token
        return key_token.lower(), value
