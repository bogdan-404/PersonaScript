class Commit:
    def __init__(self, data):
        self.data = data

    def process(self):
        prompt = "You are an NPC. I will give you all information about you and the game. Then, in my next prompts you will respond to my questions. "
        for item in self.data:
            if item['type'] == 'description':
                prompt += "The description of you is: "
                attributes = item['attributes']
                for key, value in attributes.items():
                    prompt += f"Your {key} is {value}."
            elif item['type'] == 'setting':
                prompt += "The setting of the game is: "
                attributes = item['attributes']
                for key, value in attributes.items():
                    prompt += f"The {key} is {value}."
            elif item['type'] == 'response':
                prompt += "The first dialog response you give should: "
                attributes = item['attributes']
                for key, value in attributes.items():
                    if key == 'length':
                        prompt += f"Be maximum {value} characters long."
                    elif key == 'prompt':
                        prompt += f"The initial task of yours is: {value}."
            else:
                return(f"Unexpected token '{item['type']}'")
        return prompt
