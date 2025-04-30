package EncapsulationChallenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        this.duplex = duplex;
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        
    }

    public int addToner(int tonerAmount){
        if(this.tonerLevel + tonerAmount > 100 || this.tonerLevel + tonerAmount < 0){
            return -1;
        } 
        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    }

    public int printPages(int numPages){
        int jobPages = (this.duplex) ? (numPages / 2) + (numPages % 2) : numPages;
        this.pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }

}
