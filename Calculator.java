class Calculator{
    public double x;
    public double y;
    public double res;
    public String operation;

    public void setOperandOne(double num1){
        this.x = num1;
    }

    public void setOperation(String type){
        this.operation = type;
    }

    public void setOperandTwo(double num2){
        this.y = num2;
    }

    public void performOperation(){
        if(this.operation == "+"){
            this.res = x + y;
        } else {
            this.res = x - y;
        }
    }

    public void getResults(){
        System.out.println(this.x + " " + this.operation + " " + this.y + " = " + this.res);
    }
}