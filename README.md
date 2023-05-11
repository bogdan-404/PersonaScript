# PersonaScript

PBL Semester 4 Project: Markup Language for Psychological Archetypes

## Use Case

Persona Script is a markup language used to create interactive NPC stories. An existing solution to such a problem is a mod for Mount and Blade 2, where player can ask NPCs any questions, and their response are based on ChatGPT API.

## Own Tools

Besides using ANTLR for implementing the lexer and the parser, we decided to implement our own tools. To write the lexer we used Python. To check the input we use the `re` module in order to simplify the implementation.
As a sample code we took the example we provided in the report:

```
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
}
```

As an output for the lexer we have the tokens:

```
[('DESCRIPTION', None), ('LEFT_BRACE', None), ('NAME', None), ('EQUALS', None), ('STRING_LITERAL', 'John'), ('TYPE', None), ('EQUALS', None), ('STRING_LITERAL', 'NPC'), ('MBTI', None), ('EQUALS', None), ('STRING_LITERAL', 'intj'), ('ROLE', None), ('EQUALS', None), ('STRING_LITERAL', 'protagonist'), ('BACKGROUND', None), ('EQUALS', None), ('STRING_LITERAL', 'John is a witch hunter'), ('RIGHT_BRACE', None), ('SETTING', None), ('LEFT_BRACE', None), ('TYPE', None), ('EQUALS', None), ('STRING_LITERAL', 'game'), ('CATEGORY', None), ('EQUALS', None), ('STRING_LITERAL', 'adventure, magic, open-world'), ('BACKGROUND', None), ('EQUALS', None), ('STRING_LITERAL', 'A world similar to Mars, where witches are living in forests and fight with humans'), ('RIGHT_BRACE', None), ('RESPONSE', None), ('LEFT_BRACE', None), ('LENGTH', None), ('EQUALS', None), ('NUMBER_LITERAL', 300), ('PROMPT', None), ('EQUALS', None), ('STRING_LITERAL', 'I need the background story of the character. Add some info about family. Give 3 possible stories in which John is side character'), ('RIGHT_BRACE', None)]
```

We also implemented the parser in OwnTools. After parsing, we have classes to process the data after parsing and formating it into a commit which will be then processed by the OpenAI API.

## Run the PersonaScript file

To run a PersonaScript file we use the terminal command:

```
python LauncherPersonaScript.py <path-to-file>
```
