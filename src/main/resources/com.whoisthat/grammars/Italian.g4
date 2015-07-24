grammar Italian;

game
    : question '?'
    | solution  ( '!' | EOF )
    ;

question
    : HAVE look
    | BE person
    | WEAR ACCESSORY ;

look
    : eyelook
    | hairlook
    | noselook
    | mouthlook
    | BEARD
    | REDCHEEKS
    ;

eyelook
    : EYES (eyecolor | eyesize)
    ;

eyecolor
    : EYECOL | BLACK
    ;

eyesize
    : BIGP | SMALLMP
    ;

hairlook
    : HAIR (haircolor | HAIRLEN | HAIRDO)
    ;

haircolor
    : BLACK | HAIRCOL
    ;

noselook
    : NOSE (BIGS | SMALLMS)
    ;

mouthlook
    : MOUTH (BIGS | SMALLFS)
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
	: 'calvo' | 'pelato' | 'calva' | 'pelata'
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
	: 'è'
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
	: 'grande'
	;

BIGP
	: 'grandi'
	;

SMALLFS
	: 'piccola'
	;

SMALLMS
	: 'piccolo'
	;

SMALLFP
	: 'piccole'
	;

SMALLMP
	: 'piccoli'
	;

BLACK
	: 'neri'
	;

SOLUTION
	: [a-zA-Z] [a-zA-Z]*
	;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines