package com.suivi_rendezvous.excepiton;

public enum ErrorCodes {
	
	ARTICLE_NOT_FOUND(1000),
	ARTICLE_NOT_VALID(1001),
	CATEGORY_NOT_FOUND(2000),
	CLIENT_NOT_FOUND(3000),
	COMMANDE_CLIENT_NOT_FOUND(4000),
	COMMANDE_FOURNISSEUR_NOT_FOUND(5000),
	FOURNISSEUR_NOT_FOUND(6000),
	ENTREPRISE_NOT_FOUND(7000),
	LIGNE_COMMADE_CLIENT_NOT_FOUND(8000),
	LIGNE_COMMANDE_FOURNISSEUR_NOT_FOUND(9000),
	LIGNE_VENTE_NOT_FOUND(10000),
	MOUVEMENT_STOCKS_NOT_FOUND(11000),
	UTILISATEUR_NOT_FOUND(12000),
	VENTE_NOT_FOUND(5000),
	
	;
	
	private int code;
	
	private ErrorCodes(int code) {
		this.code=code;    
	}
	
	public int getErrorCodes() {
		return code;
	}
	public void setErrorCodes(int code) {
		this.code=code;
	}

}
