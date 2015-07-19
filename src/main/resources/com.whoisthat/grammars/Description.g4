// Define a grammar called Hello
grammar Description;
game
    : question '?'
    | solution ( ( '!' | EOF ) )
    ;

question
    :  HAVE look
    | BE person
    | WEAR ACCESSORY
    ;

look
    : EYES eyelook
    | HAIR hairlook
    | NOSE noselook
    | MOUTH mouthlook
    | BEARD
    | REDCHEEKS
    ;

eyelook
    : eyecolor
    | eyesize
    ;

eyecolor
    : EYECOL
    | BLACK
    ;

eyesize
    :  BIGP
    | SMALLMP
    ;

hairlook
    : haircolor
    | HAIRLEN
    | HAIRDO
    ;

haircolor
    : BLACK
    | HAIRCOL
    ;

noselook
    : BIGS
    | SMALLMS
    ;

mouthlook
    : BIGS
    | SMALLFS
    ;

person
    : SEX
    | AGE
    | BALD
    | BODY
    | ETHNIC
    ;

solution
    : SOLUTION
    ;

BEARD
	: 'la barba'
	| 'i baffi'
	;

EYECOL
	: 'marroni'
	| 'verdi'
	| 'azzurri'
	;

HAIRCOL
	: 'biondi'
	| 'castani'
	| 'rossi'
	| 'bianchi'
	;

HAIRLEN
	: 'lunghi'
	| 'corti'
	;

HAIRDO
	: 'ricci'
	| 'lisci'
	| 'mossi'
	;

BALD
	: 'calvo'
	;

SEX
	: 'maschio'
	| 'femmina'
	;

AGE
	: 'vecchio'
	| 'giovane'
	;

BODY
	: 'grasso'
	| 'magro'
	;

ETHNIC
	: 'bianco'
	| 'nero'
	| 'asiatico'
	| 'indiano'
	;

ACCESSORY
	: 'il cappello'
	| 'gli occhiali'
	| 'gli orecchini'
	| 'il rossetto'
	;

HAVE
	: 'ha'
	;

BE
	: '\u00e8'
	;

WEAR
	: 'porta'
	;

EYES
	: 'gli occhi'
	;

MOUTH
	: 'la bocca'
	;

HAIR
	: 'i capelli'
	;

NOSE
	: 'il naso'
	;

REDCHEEKS
	: 'le guance rosse'
	;

BIGS
	:'grande'
	;

BIGP
	:'grandi'
	;

SMALLFS
	:'piccola'
	;

SMALLMS
	:'piccolo'
	;

SMALLFP
	:'piccole'
	;

SMALLMP
	:'piccoli'
	;

BLACK
	:'neri'
	;

SOLUTION
	:['A'-'Z'] (['a'-'z'])*
	;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines