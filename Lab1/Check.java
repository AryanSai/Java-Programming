class Check{
    public static void main(String args[]){
        RationalNumber x,y,z;
        y = new RationalNumber(6,7);
        x = new RationalNumber(Validator1.getInt("Enter Numerator: "),Validator1.getInt("Enter Denominator: "));
        
        System.out.println("GCD:"+x.getGcd());

        System.out.println("Numerator: " + x.getNumerator() + " Denominator: "+ x.getDenominator());

        System.out.println("Double Value of the fraction:" + x.getDoubleValue());

        z = x.add(y);
        System.out.println("---Addition---");
        System.out.println("Numerator: " + z.getNumerator() + " Denominator: "+ z.getDenominator());

        z = x.subtract(y);
        System.out.println("---Subtraction---");
        System.out.println("Numerator: " + z.getNumerator() + " Denominator: "+ z.getDenominator());

        z = x.multiply(y);
        System.out.println("---Multiplication---");
        System.out.println("Numerator: " + z.getNumerator() + " Denominator: "+ z.getDenominator());

        z = x.divide(y);
        System.out.println("---Division---");
        System.out.println("Numerator: " + z.getNumerator() + " Denominator: "+ z.getDenominator());

    }
}