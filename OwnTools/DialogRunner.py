import openai


class DialogRunner:
    def __init__(self, api_key, persona_script_prompt):
        openai.api_key = api_key
        self.messages = [
            {"role": "system", "content": "You are a helpful assistant."},
            {"role": "user", "content": persona_script_prompt},
        ]

    def run_dialog(self):
        while True:
            response = openai.ChatCompletion.create(
                model="gpt-3.5-turbo",
                messages=self.messages,
                max_tokens=150,
            )
            reply = response.choices[0].message['content'].strip()
            print(f"NPC: {reply}")
            self.messages.append({"role": "assistant", "content": reply})

            message = input("User: ")
            if message:
                self.messages.append({"role": "user", "content": message})
