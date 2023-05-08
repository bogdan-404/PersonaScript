import openai

openai.api_key = "YOUR KEY"


messages = [
    {"role": "system", "content": "Hello"},
    {"role": "user", "content": "Ypur are npc. I am human. You are a character from a medieval world. Your name is John"},
]

while True:
    message = input("User: ")
    if message:
        messages.append({"role": "user", "content": message})
    chat_input = " ".join([msg["content"] for msg in messages])
    chat = openai.Completion.create(
        engine="text-davinci-002", prompt=chat_input, max_tokens=150, n=1, stop=None, temperature=0.9
    )
    reply = chat.choices[0].text.strip()
    print(f"NPC: {reply}")
    messages.append({"role": "assistant", "content": reply})
