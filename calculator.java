
class adder{
    public int Addition(int x, int y) {
       
        return (x+y);
    }

    public int Subtraction(int x, int y){

        return x-y;
    }
    public float Divider(int x, int y){

        return (x/y);
    }

    public float remainder(int x, int y){

        return x%y;
    }
    public int equation1(int x, int y, int z){

        return x+y*6;
    }

    public float equation2(int x, int y, int z){

        return ((x+y)%9);
    }

    public float equation3(int w,int x, int y, int z){

        return (w+x*y/z);
    }

    public float equation4(int u, int v, int w, int x, int y, int z){

        return (u+v/w*x-y%z);
    }

    public float multiply2(int x, int y){

        return x*y;
    }

    public void multiplicationTable(int x){

        for (int i = 1; i <= 10; i++){
            System.out.println("Times "+ i +": "+ (x*(i)));
        }
    }
}

