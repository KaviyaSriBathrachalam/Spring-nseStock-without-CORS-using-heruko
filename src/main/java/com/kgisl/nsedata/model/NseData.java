package com.kgisl.nsedata.model;


public class NseData  {

	
	
	private String Symbol;

    private String ItP;

	private String previousClose;

	private String ptsC;
	
	private String Status;
    
    public String getSymbol() {
		return Symbol;
	}

	public void setSymbol(String Symbol) {
		this.Symbol = Symbol;
	}

	public String getItp() {
		return ItP;
	}
	public void setItp(String Itp){
		this.ItP=ItP;
	} 
	public String getpreviousClose(){
		return previousClose;
	}

	public void setpreviousClose(String previousClose) {
		this.previousClose = previousClose;
	}

	public String getptsC()
	{
		return ptsC;
	} 
	
	public void setptsC(String ptsC)
	{
		this.ptsC = ptsC;
	}

	public String getStatus(){
		return Status;
	}
	public void setStatus(String Status)
	{
		this.Status=Status;
	}
}

