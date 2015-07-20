grammar English;

game
	: question '?'
	| solution ( '!' | EOF )
	;
	
question
	: AUX PRON( HAVE look | WEAR accessory )
	| BE PRON person
	;
	
look
	: color
	| measures
	| beard
	| hairStyle
	| cheeks
	;

color
	: ( BLACK | BROWN ) ( EYES | HAIR )
	| ( WHITE | BLONDE | RED ) HAIR 
	| ( GREEN | BLUE ) EYES
	;
	
measures
	: SIZEA ( NOSE | MOUTH )
	| LENGTH HAIR
	| SIZE EYES
	;
	
beard
	: BEARD
	;
	
hairStyle
	: HAIRDO HAIR
	;
	
cheeks
	: REDCHEEKS
	;
	
person
	: SEX
	| AGE
	| BALD
	| BODY
	| ethnic
	;
	
ethnic
	: ETHNIC
	| BLACK
	| WHITE
	;
	
accessory
	: ACCESSORY
	;
	
solution
	: SOLUTION
	;

HAIR
	: 'hair'
	;

EYES
	: 'eyes'
	;

MOUTH
	: 'mouth'
	;

BEARD
	: 'a beard'
	| 'a moustache'
	;

NOSE
	: 'nose'
	;

SEX
	: 'a man'
	| 'a woman'
	;

AGE
	: 'old'
	| 'young'
	;

BODY
	: 'fat'
	| 'slim'
	;

ETHNIC
	: 'asian'
	| 'indian'
	;

REDCHEEKS
	: 'red cheeks'
	;

ACCESSORY
	: 'a hat'
	| 'glasses'
	| 'earrings'
	| 'lipstick'
	;

HAVE
	: 'have'
	;

BE
	: 'is'
	;

WEAR
	: 'wear'
	;

AUX
	: 'does'
	;

PRON
	: 'he'
	| 'she'
	| 'it'
	;

BLACK
	: 'black'
	;

BROWN
	: 'brown'
	;

GREEN
	: 'green'
	;

BLUE
	: 'blue'
	;

WHITE
	: 'white'
	;

RED
	: 'red'
	;

BLONDE
	: 'blonde'
	;

LENGTH
	: 'long'
	| 'short'
	;

SIZE
	: 'big'
	| 'small'
	;

SIZEA
	: 'a big'
	| 'a small'
	;

BALD
	: 'bald'
	;

HAIRDO
	: 'straight'
	| 'curly'
	| 'wavy'
	;

SOLUTION
	:['A'-'Z'] (['a'-'z'])*
	;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines