# Generated from PersonaScript.g4 by ANTLR 4.12.0
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,19,113,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,1,0,1,0,1,0,1,0,1,1,1,1,1,1,5,1,38,8,1,10,1,12,1,41,9,
        1,1,1,1,1,1,2,1,2,1,2,1,2,1,2,3,2,50,8,2,1,3,1,3,1,3,1,3,1,4,1,4,
        1,4,1,4,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,6,1,7,1,7,1,7,1,7,1,8,1,8,
        1,8,5,8,75,8,8,10,8,12,8,78,9,8,1,8,1,8,1,9,1,9,1,9,3,9,85,8,9,1,
        10,1,10,1,10,1,10,1,11,1,11,1,11,5,11,94,8,11,10,11,12,11,97,9,11,
        1,11,1,11,1,12,1,12,3,12,103,8,12,1,13,1,13,1,13,1,13,1,14,1,14,
        1,14,1,14,1,14,0,0,15,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,0,
        0,107,0,30,1,0,0,0,2,34,1,0,0,0,4,49,1,0,0,0,6,51,1,0,0,0,8,55,1,
        0,0,0,10,59,1,0,0,0,12,63,1,0,0,0,14,67,1,0,0,0,16,71,1,0,0,0,18,
        84,1,0,0,0,20,86,1,0,0,0,22,90,1,0,0,0,24,102,1,0,0,0,26,104,1,0,
        0,0,28,108,1,0,0,0,30,31,3,2,1,0,31,32,3,16,8,0,32,33,3,22,11,0,
        33,1,1,0,0,0,34,35,5,6,0,0,35,39,5,1,0,0,36,38,3,4,2,0,37,36,1,0,
        0,0,38,41,1,0,0,0,39,37,1,0,0,0,39,40,1,0,0,0,40,42,1,0,0,0,41,39,
        1,0,0,0,42,43,5,2,0,0,43,3,1,0,0,0,44,50,3,6,3,0,45,50,3,8,4,0,46,
        50,3,10,5,0,47,50,3,12,6,0,48,50,3,14,7,0,49,44,1,0,0,0,49,45,1,
        0,0,0,49,46,1,0,0,0,49,47,1,0,0,0,49,48,1,0,0,0,50,5,1,0,0,0,51,
        52,5,9,0,0,52,53,5,3,0,0,53,54,5,17,0,0,54,7,1,0,0,0,55,56,5,10,
        0,0,56,57,5,3,0,0,57,58,5,17,0,0,58,9,1,0,0,0,59,60,5,11,0,0,60,
        61,5,3,0,0,61,62,5,17,0,0,62,11,1,0,0,0,63,64,5,12,0,0,64,65,5,3,
        0,0,65,66,5,17,0,0,66,13,1,0,0,0,67,68,5,13,0,0,68,69,5,3,0,0,69,
        70,5,17,0,0,70,15,1,0,0,0,71,72,5,7,0,0,72,76,5,1,0,0,73,75,3,18,
        9,0,74,73,1,0,0,0,75,78,1,0,0,0,76,74,1,0,0,0,76,77,1,0,0,0,77,79,
        1,0,0,0,78,76,1,0,0,0,79,80,5,2,0,0,80,17,1,0,0,0,81,85,3,8,4,0,
        82,85,3,20,10,0,83,85,3,14,7,0,84,81,1,0,0,0,84,82,1,0,0,0,84,83,
        1,0,0,0,85,19,1,0,0,0,86,87,5,14,0,0,87,88,5,3,0,0,88,89,5,17,0,
        0,89,21,1,0,0,0,90,91,5,8,0,0,91,95,5,1,0,0,92,94,3,24,12,0,93,92,
        1,0,0,0,94,97,1,0,0,0,95,93,1,0,0,0,95,96,1,0,0,0,96,98,1,0,0,0,
        97,95,1,0,0,0,98,99,5,2,0,0,99,23,1,0,0,0,100,103,3,26,13,0,101,
        103,3,28,14,0,102,100,1,0,0,0,102,101,1,0,0,0,103,25,1,0,0,0,104,
        105,5,15,0,0,105,106,5,3,0,0,106,107,5,18,0,0,107,27,1,0,0,0,108,
        109,5,16,0,0,109,110,5,3,0,0,110,111,5,17,0,0,111,29,1,0,0,0,6,39,
        49,76,84,95,102
    ]

class PersonaScriptParser ( Parser ):

    grammarFileName = "PersonaScript.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'{'", "'}'", "'='", "','", "'\"'", "'Description'", 
                     "'Setting'", "'Response'", "'name'", "'type'", "'mbti'", 
                     "'role'", "'background'", "'category'", "'length'", 
                     "'prompt'" ]

    symbolicNames = [ "<INVALID>", "OPEN_BRACE", "CLOSE_BRACE", "EQUALS", 
                      "COMMA", "QUOTE", "DESCRIPTION", "SETTING", "RESPONSE", 
                      "NAME", "TYPE", "MBTI", "ROLE", "BACKGROUND", "CATEGORY", 
                      "LENGTH", "PROMPT", "STRING_LITERAL", "NUMBER_LITERAL", 
                      "WS" ]

    RULE_program = 0
    RULE_description = 1
    RULE_descriptionProperty = 2
    RULE_nameProperty = 3
    RULE_typeProperty = 4
    RULE_mbtiProperty = 5
    RULE_roleProperty = 6
    RULE_backgroundProperty = 7
    RULE_setting = 8
    RULE_settingProperty = 9
    RULE_categoryProperty = 10
    RULE_response = 11
    RULE_responseProperty = 12
    RULE_lengthProperty = 13
    RULE_promptProperty = 14

    ruleNames =  [ "program", "description", "descriptionProperty", "nameProperty", 
                   "typeProperty", "mbtiProperty", "roleProperty", "backgroundProperty", 
                   "setting", "settingProperty", "categoryProperty", "response", 
                   "responseProperty", "lengthProperty", "promptProperty" ]

    EOF = Token.EOF
    OPEN_BRACE=1
    CLOSE_BRACE=2
    EQUALS=3
    COMMA=4
    QUOTE=5
    DESCRIPTION=6
    SETTING=7
    RESPONSE=8
    NAME=9
    TYPE=10
    MBTI=11
    ROLE=12
    BACKGROUND=13
    CATEGORY=14
    LENGTH=15
    PROMPT=16
    STRING_LITERAL=17
    NUMBER_LITERAL=18
    WS=19

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.12.0")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def description(self):
            return self.getTypedRuleContext(PersonaScriptParser.DescriptionContext,0)


        def setting(self):
            return self.getTypedRuleContext(PersonaScriptParser.SettingContext,0)


        def response(self):
            return self.getTypedRuleContext(PersonaScriptParser.ResponseContext,0)


        def getRuleIndex(self):
            return PersonaScriptParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)




    def program(self):

        localctx = PersonaScriptParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 30
            self.description()
            self.state = 31
            self.setting()
            self.state = 32
            self.response()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DescriptionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DESCRIPTION(self):
            return self.getToken(PersonaScriptParser.DESCRIPTION, 0)

        def OPEN_BRACE(self):
            return self.getToken(PersonaScriptParser.OPEN_BRACE, 0)

        def CLOSE_BRACE(self):
            return self.getToken(PersonaScriptParser.CLOSE_BRACE, 0)

        def descriptionProperty(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PersonaScriptParser.DescriptionPropertyContext)
            else:
                return self.getTypedRuleContext(PersonaScriptParser.DescriptionPropertyContext,i)


        def getRuleIndex(self):
            return PersonaScriptParser.RULE_description

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDescription" ):
                listener.enterDescription(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDescription" ):
                listener.exitDescription(self)




    def description(self):

        localctx = PersonaScriptParser.DescriptionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_description)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 34
            self.match(PersonaScriptParser.DESCRIPTION)
            self.state = 35
            self.match(PersonaScriptParser.OPEN_BRACE)
            self.state = 39
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 15872) != 0):
                self.state = 36
                self.descriptionProperty()
                self.state = 41
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 42
            self.match(PersonaScriptParser.CLOSE_BRACE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DescriptionPropertyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def nameProperty(self):
            return self.getTypedRuleContext(PersonaScriptParser.NamePropertyContext,0)


        def typeProperty(self):
            return self.getTypedRuleContext(PersonaScriptParser.TypePropertyContext,0)


        def mbtiProperty(self):
            return self.getTypedRuleContext(PersonaScriptParser.MbtiPropertyContext,0)


        def roleProperty(self):
            return self.getTypedRuleContext(PersonaScriptParser.RolePropertyContext,0)


        def backgroundProperty(self):
            return self.getTypedRuleContext(PersonaScriptParser.BackgroundPropertyContext,0)


        def getRuleIndex(self):
            return PersonaScriptParser.RULE_descriptionProperty

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDescriptionProperty" ):
                listener.enterDescriptionProperty(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDescriptionProperty" ):
                listener.exitDescriptionProperty(self)




    def descriptionProperty(self):

        localctx = PersonaScriptParser.DescriptionPropertyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_descriptionProperty)
        try:
            self.state = 49
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [9]:
                self.enterOuterAlt(localctx, 1)
                self.state = 44
                self.nameProperty()
                pass
            elif token in [10]:
                self.enterOuterAlt(localctx, 2)
                self.state = 45
                self.typeProperty()
                pass
            elif token in [11]:
                self.enterOuterAlt(localctx, 3)
                self.state = 46
                self.mbtiProperty()
                pass
            elif token in [12]:
                self.enterOuterAlt(localctx, 4)
                self.state = 47
                self.roleProperty()
                pass
            elif token in [13]:
                self.enterOuterAlt(localctx, 5)
                self.state = 48
                self.backgroundProperty()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NamePropertyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NAME(self):
            return self.getToken(PersonaScriptParser.NAME, 0)

        def EQUALS(self):
            return self.getToken(PersonaScriptParser.EQUALS, 0)

        def STRING_LITERAL(self):
            return self.getToken(PersonaScriptParser.STRING_LITERAL, 0)

        def getRuleIndex(self):
            return PersonaScriptParser.RULE_nameProperty

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNameProperty" ):
                listener.enterNameProperty(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNameProperty" ):
                listener.exitNameProperty(self)




    def nameProperty(self):

        localctx = PersonaScriptParser.NamePropertyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_nameProperty)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 51
            self.match(PersonaScriptParser.NAME)
            self.state = 52
            self.match(PersonaScriptParser.EQUALS)
            self.state = 53
            self.match(PersonaScriptParser.STRING_LITERAL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TypePropertyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TYPE(self):
            return self.getToken(PersonaScriptParser.TYPE, 0)

        def EQUALS(self):
            return self.getToken(PersonaScriptParser.EQUALS, 0)

        def STRING_LITERAL(self):
            return self.getToken(PersonaScriptParser.STRING_LITERAL, 0)

        def getRuleIndex(self):
            return PersonaScriptParser.RULE_typeProperty

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTypeProperty" ):
                listener.enterTypeProperty(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTypeProperty" ):
                listener.exitTypeProperty(self)




    def typeProperty(self):

        localctx = PersonaScriptParser.TypePropertyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_typeProperty)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 55
            self.match(PersonaScriptParser.TYPE)
            self.state = 56
            self.match(PersonaScriptParser.EQUALS)
            self.state = 57
            self.match(PersonaScriptParser.STRING_LITERAL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MbtiPropertyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def MBTI(self):
            return self.getToken(PersonaScriptParser.MBTI, 0)

        def EQUALS(self):
            return self.getToken(PersonaScriptParser.EQUALS, 0)

        def STRING_LITERAL(self):
            return self.getToken(PersonaScriptParser.STRING_LITERAL, 0)

        def getRuleIndex(self):
            return PersonaScriptParser.RULE_mbtiProperty

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMbtiProperty" ):
                listener.enterMbtiProperty(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMbtiProperty" ):
                listener.exitMbtiProperty(self)




    def mbtiProperty(self):

        localctx = PersonaScriptParser.MbtiPropertyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_mbtiProperty)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 59
            self.match(PersonaScriptParser.MBTI)
            self.state = 60
            self.match(PersonaScriptParser.EQUALS)
            self.state = 61
            self.match(PersonaScriptParser.STRING_LITERAL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RolePropertyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ROLE(self):
            return self.getToken(PersonaScriptParser.ROLE, 0)

        def EQUALS(self):
            return self.getToken(PersonaScriptParser.EQUALS, 0)

        def STRING_LITERAL(self):
            return self.getToken(PersonaScriptParser.STRING_LITERAL, 0)

        def getRuleIndex(self):
            return PersonaScriptParser.RULE_roleProperty

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRoleProperty" ):
                listener.enterRoleProperty(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRoleProperty" ):
                listener.exitRoleProperty(self)




    def roleProperty(self):

        localctx = PersonaScriptParser.RolePropertyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_roleProperty)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 63
            self.match(PersonaScriptParser.ROLE)
            self.state = 64
            self.match(PersonaScriptParser.EQUALS)
            self.state = 65
            self.match(PersonaScriptParser.STRING_LITERAL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BackgroundPropertyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BACKGROUND(self):
            return self.getToken(PersonaScriptParser.BACKGROUND, 0)

        def EQUALS(self):
            return self.getToken(PersonaScriptParser.EQUALS, 0)

        def STRING_LITERAL(self):
            return self.getToken(PersonaScriptParser.STRING_LITERAL, 0)

        def getRuleIndex(self):
            return PersonaScriptParser.RULE_backgroundProperty

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBackgroundProperty" ):
                listener.enterBackgroundProperty(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBackgroundProperty" ):
                listener.exitBackgroundProperty(self)




    def backgroundProperty(self):

        localctx = PersonaScriptParser.BackgroundPropertyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_backgroundProperty)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 67
            self.match(PersonaScriptParser.BACKGROUND)
            self.state = 68
            self.match(PersonaScriptParser.EQUALS)
            self.state = 69
            self.match(PersonaScriptParser.STRING_LITERAL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SettingContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SETTING(self):
            return self.getToken(PersonaScriptParser.SETTING, 0)

        def OPEN_BRACE(self):
            return self.getToken(PersonaScriptParser.OPEN_BRACE, 0)

        def CLOSE_BRACE(self):
            return self.getToken(PersonaScriptParser.CLOSE_BRACE, 0)

        def settingProperty(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PersonaScriptParser.SettingPropertyContext)
            else:
                return self.getTypedRuleContext(PersonaScriptParser.SettingPropertyContext,i)


        def getRuleIndex(self):
            return PersonaScriptParser.RULE_setting

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSetting" ):
                listener.enterSetting(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSetting" ):
                listener.exitSetting(self)




    def setting(self):

        localctx = PersonaScriptParser.SettingContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_setting)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 71
            self.match(PersonaScriptParser.SETTING)
            self.state = 72
            self.match(PersonaScriptParser.OPEN_BRACE)
            self.state = 76
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 25600) != 0):
                self.state = 73
                self.settingProperty()
                self.state = 78
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 79
            self.match(PersonaScriptParser.CLOSE_BRACE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SettingPropertyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def typeProperty(self):
            return self.getTypedRuleContext(PersonaScriptParser.TypePropertyContext,0)


        def categoryProperty(self):
            return self.getTypedRuleContext(PersonaScriptParser.CategoryPropertyContext,0)


        def backgroundProperty(self):
            return self.getTypedRuleContext(PersonaScriptParser.BackgroundPropertyContext,0)


        def getRuleIndex(self):
            return PersonaScriptParser.RULE_settingProperty

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSettingProperty" ):
                listener.enterSettingProperty(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSettingProperty" ):
                listener.exitSettingProperty(self)




    def settingProperty(self):

        localctx = PersonaScriptParser.SettingPropertyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_settingProperty)
        try:
            self.state = 84
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [10]:
                self.enterOuterAlt(localctx, 1)
                self.state = 81
                self.typeProperty()
                pass
            elif token in [14]:
                self.enterOuterAlt(localctx, 2)
                self.state = 82
                self.categoryProperty()
                pass
            elif token in [13]:
                self.enterOuterAlt(localctx, 3)
                self.state = 83
                self.backgroundProperty()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CategoryPropertyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CATEGORY(self):
            return self.getToken(PersonaScriptParser.CATEGORY, 0)

        def EQUALS(self):
            return self.getToken(PersonaScriptParser.EQUALS, 0)

        def STRING_LITERAL(self):
            return self.getToken(PersonaScriptParser.STRING_LITERAL, 0)

        def getRuleIndex(self):
            return PersonaScriptParser.RULE_categoryProperty

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCategoryProperty" ):
                listener.enterCategoryProperty(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCategoryProperty" ):
                listener.exitCategoryProperty(self)




    def categoryProperty(self):

        localctx = PersonaScriptParser.CategoryPropertyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_categoryProperty)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 86
            self.match(PersonaScriptParser.CATEGORY)
            self.state = 87
            self.match(PersonaScriptParser.EQUALS)
            self.state = 88
            self.match(PersonaScriptParser.STRING_LITERAL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ResponseContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def RESPONSE(self):
            return self.getToken(PersonaScriptParser.RESPONSE, 0)

        def OPEN_BRACE(self):
            return self.getToken(PersonaScriptParser.OPEN_BRACE, 0)

        def CLOSE_BRACE(self):
            return self.getToken(PersonaScriptParser.CLOSE_BRACE, 0)

        def responseProperty(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PersonaScriptParser.ResponsePropertyContext)
            else:
                return self.getTypedRuleContext(PersonaScriptParser.ResponsePropertyContext,i)


        def getRuleIndex(self):
            return PersonaScriptParser.RULE_response

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterResponse" ):
                listener.enterResponse(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitResponse" ):
                listener.exitResponse(self)




    def response(self):

        localctx = PersonaScriptParser.ResponseContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_response)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 90
            self.match(PersonaScriptParser.RESPONSE)
            self.state = 91
            self.match(PersonaScriptParser.OPEN_BRACE)
            self.state = 95
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==15 or _la==16:
                self.state = 92
                self.responseProperty()
                self.state = 97
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 98
            self.match(PersonaScriptParser.CLOSE_BRACE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ResponsePropertyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def lengthProperty(self):
            return self.getTypedRuleContext(PersonaScriptParser.LengthPropertyContext,0)


        def promptProperty(self):
            return self.getTypedRuleContext(PersonaScriptParser.PromptPropertyContext,0)


        def getRuleIndex(self):
            return PersonaScriptParser.RULE_responseProperty

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterResponseProperty" ):
                listener.enterResponseProperty(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitResponseProperty" ):
                listener.exitResponseProperty(self)




    def responseProperty(self):

        localctx = PersonaScriptParser.ResponsePropertyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_responseProperty)
        try:
            self.state = 102
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [15]:
                self.enterOuterAlt(localctx, 1)
                self.state = 100
                self.lengthProperty()
                pass
            elif token in [16]:
                self.enterOuterAlt(localctx, 2)
                self.state = 101
                self.promptProperty()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LengthPropertyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LENGTH(self):
            return self.getToken(PersonaScriptParser.LENGTH, 0)

        def EQUALS(self):
            return self.getToken(PersonaScriptParser.EQUALS, 0)

        def NUMBER_LITERAL(self):
            return self.getToken(PersonaScriptParser.NUMBER_LITERAL, 0)

        def getRuleIndex(self):
            return PersonaScriptParser.RULE_lengthProperty

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLengthProperty" ):
                listener.enterLengthProperty(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLengthProperty" ):
                listener.exitLengthProperty(self)




    def lengthProperty(self):

        localctx = PersonaScriptParser.LengthPropertyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_lengthProperty)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 104
            self.match(PersonaScriptParser.LENGTH)
            self.state = 105
            self.match(PersonaScriptParser.EQUALS)
            self.state = 106
            self.match(PersonaScriptParser.NUMBER_LITERAL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PromptPropertyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PROMPT(self):
            return self.getToken(PersonaScriptParser.PROMPT, 0)

        def EQUALS(self):
            return self.getToken(PersonaScriptParser.EQUALS, 0)

        def STRING_LITERAL(self):
            return self.getToken(PersonaScriptParser.STRING_LITERAL, 0)

        def getRuleIndex(self):
            return PersonaScriptParser.RULE_promptProperty

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPromptProperty" ):
                listener.enterPromptProperty(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPromptProperty" ):
                listener.exitPromptProperty(self)




    def promptProperty(self):

        localctx = PersonaScriptParser.PromptPropertyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_promptProperty)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 108
            self.match(PersonaScriptParser.PROMPT)
            self.state = 109
            self.match(PersonaScriptParser.EQUALS)
            self.state = 110
            self.match(PersonaScriptParser.STRING_LITERAL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





