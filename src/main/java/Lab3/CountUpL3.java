package Lab3;

public class CountUpL3 {
  //variable creation
  private int counter;
  private int maxValue;
  private int overflows;

  public CountUpL3() {    //default constructor that defults the max value to 10000
    counter = 0;
    overflows = 0;
    maxValue = 10000;
  }

  public CountUpL3(int maxValue_){  //constructer that allows the setting of the max value
    counter = 0;
    overflows = 0;
    maxValue = maxValue_;
  }

  // the four increment methods that add to the counter then chec for overflows
  public void ones() { 
    checkOverflow();
  }

  public void tens() {
    counter += 10;
    checkOverflow();
  }

  public void hundreds() {
    counter += 100;
    checkOverflow();
  }

  public void thousands() {
    counter += 1000;
    checkOverflow();
  }
  //checks if it overflows into the negatives or above the max value
  public void checkOverflow(){
    if (counter >= maxValue){
      counter = 0;
      overflows++;
    } else if (counter < 0){
      counter = 0;
      overflows++;
    }
  }

  //returns a string for the total of the counter in money format
  public String total() {
    int dollars = counter / 100;
    int cents = counter % 100;
    String tempoutput = "$" + dollars + ".";
    
    if (cents < 10) {
      tempoutput += "0" + cents;
    } else{
      tempoutput += cents;
    }
    return tempoutput;
  }

  //returns the amount of times the counter has overflowed
  public int getOverflows() {
    return overflows;
  }

  public void clear() {  //clear method
    counter = 0;
    overflows = 0;
  }

  //the four decrement methods that subtract and then check for overflows
  public void decrementOnes() {
    counter -= 1;
    checkOverflow();
  }

  public void decrementTens() {
    counter -= 10;
    checkOverflow();
  }

  public void decrementHundreds() {
    counter -= 100;
    checkOverflow();
  }

  public void decrementThousands() {
    counter -= 1000;
    checkOverflow();
  }

  //custom increment method that allows the incrementation of a specific amount
  public void increment(int amount) {
    int total = counter;

    total += amount;
    while (total > maxValue) {
      total -= maxValue;
      overflows++;
    }

    counter = total;
    System.out.println("Incremented by " + amount);
  }
}