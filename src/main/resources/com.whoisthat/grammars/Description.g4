// Define a grammar called Hello
grammar Description;


gamepeople
	:	( person )+
	;

person
	: NAME OBR portrait CBR
	;
	
portrait
	: ( look )+
	;

look
	: sex SCOLON
	| eyelook SCOLON
	| hairlook SCOLON
	| cheeks SCOLON
	| age SCOLON
	| noselook SCOLON
	| mouthlook SCOLON
	| beard SCOLON
	| body SCOLON
	| ethnic SCOLON
	| accessory SCOLON
	| bald SCOLON
	;

eyelook
    : EYES EQUALS eyecolor ( COMMA SIZE )?
    ;

hairlook
    : HAIR EQUALS HAIRLEN COMMA haircolor ( COMMA HAIRDO )?
    ;

noselook
    : NOSE EQUALS SIZE
    ;

mouthlook
    : MOUTH EQUALS SIZE
    ;

beard
    : BEARD EQUALS ( BEARD | MOUSTACHE )
    ;

age
    : AGE EQUALS AGED
    ;

cheeks
    : CHEEKS EQUALS BOOL
    ;

bald
    : BALD EQUALS BOOL
    ;

haircolor
    : COL
    | HAIRCOL
    ;

eyecolor
    : EYECOL
    | COL
    ;

sex
    : SEX EQUALS SEXD
    ;

body
    : BODY EQUALS BODYD
    ;

ethnic
    : ETHNIC EQUALS ( ETHNICD | COL )
    ;

accessory
    : ACCESSORY EQUALS ACC ( COMMA ACC )*
    ;

EYES
	: 'eyes'
	;

MOUTH
	: 'mouth'
	;

HAIR
	: 'hair'
	;

NOSE
	: 'nose'
	;

CHEEKS
	: 'cheeks'
	;

BALD
	: 'bald'
	;

SEX
	: 'sex'
	;

AGE
	: 'age'
	;

BODY
	: 'body'
	;

BEARD
	: 'beard'
	;

MOUSTACHE
	: 'moustache'
	;

ETHNIC
	: 'ethnic'
	;

ACCESSORY
	: 'accessory'
	;

SEXD
	: 'man' | 'woman'
	;

AGED
	: 'old' | 'young'
	;

BODYD
	: 'fat' | 'thin'
	;

EYECOL
	: 'green' | 'blue'
	;

HAIRCOL
	: 'blonde' | 'red'
	;

HAIRLEN
	: 'long' | 'short'
	;

HAIRDO
	: 'curly' | 'straight' | 'wavy'
	;

ETHNICD
	: 'asian'
	;

COL
	: 'brown' | 'black' | 'white'
	;

SIZE
	: 'big' | 'small'
	;

BOOL
	: 'true' | 'false'
	;

COMMA
	: ','
	;

SCOLON
	: ';'
	;

OBR
	: '{'
	;

CBR
	: '}'
	;

EQUALS
	: '='
	;

NAME
	: ['A'-'Z'] (['a'-'z'])*
	;
ACC
	: ['a'-'z'] (['a'-'z'])*
	;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines