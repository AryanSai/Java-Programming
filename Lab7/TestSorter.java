class TestSorter{
    public static void main(String args[]){
        ArraySorter array = null;
        try{
            try{
                if(args.length != 1){
                    throw new IllegalArgumentException();
                }
            }catch(IllegalArgumentException e){
                System.out.println("Should pass only one argument");
            }
    
        int bound = Integer.parseInt(args[0]);
        array = new ArraySorter(bound);
    
        System.out.println("Before sorting: \n"+array);
        array.getSorted();
        System.out.println("After sorting first 10 elements\n"+array);
        }
        catch(NumberFormatException e){
            System.out.println("The Argument cannot be converted to Integer");
        }
        catch(IllegalArgumentException e){
            System.out.println("The argument must be positive"+ e.getMessage());
            e.printStackTrace();
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Illegal index.. array element not present");
        }
        catch(Exception e){
            System.out.println("Exception Caught: "+e.getMessage());
        }
    
        finally{
            System.out.println("Array disposed...");
            array = null;
            System.gc();
        }
    }
    
}
