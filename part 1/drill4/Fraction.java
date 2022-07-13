package lesson1.drill4;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator(){
        return this.numerator;
    }

    public int getDenominator(){
        return this.denominator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public void setDenominator(int denominator){
        if (denominator !=0)
            this.denominator = denominator;
    }

    public double realValue(){
        return (double)this.numerator /this.denominator;
    }

    public void add(Fraction other){
        if (this.denominator == other.denominator)
            this.numerator +=other.numerator;
        else {
            this.numerator = this.numerator *other.denominator + this.denominator *other.numerator;
            this.denominator = this.denominator * other.denominator;
        }
    }

    public static Fraction add(Fraction f1,Fraction f2){
        int newNumerator = f1.numerator*f2.denominator + f1.denominator*f2.numerator;
        int newDenominator = f1.denominator*f2.denominator;
        return new Fraction( newNumerator, newDenominator);
    }

    public void simplify(){
        boolean flag = true;
        for (int i = this.numerator; i>1&&flag; i--){
            if (this.denominator %i == 0 && this.numerator %i == 0) {
                this.numerator /= i;
                this.denominator /= i;
                flag = false;
            }
        }
    }

    public void print(){
        System.out.println("numerator = " +this.numerator +" denominator = "+this.denominator);
    }
}

