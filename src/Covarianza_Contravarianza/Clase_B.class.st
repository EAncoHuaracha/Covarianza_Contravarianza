Class {
	#name : #'Clase_B',
	#superclass : #Object,
	#category : #'Covarianza_Contravarianza'
}

{ #category : #accessing }
Clase_B >> alpha [ 
	Transcript show: 'Hola soy alpha desde la Clase B';cr.
	

]

{ #category : #accessing }
Clase_B >> beta [
	Transcript show: 'Hola soy beta';cr.
]
