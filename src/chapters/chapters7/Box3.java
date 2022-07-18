package chapters.chapters7;

public class Box3 {
    double width;
    double heigth;
    double depth;

    Box3(Box3 ob) {
        width = ob.width;
        heigth = ob.heigth;
        depth = ob.depth;
    }
    Box3(double w, double h,double d){
        width= w;
        heigth = h;
        depth = d;
    }
    Box3(){
        width =-1;
        heigth = -1;
        depth = -1;
    }
    Box3(double len){
         width =  heigth = depth = len;
    }
    double volume(){
        return  width * heigth * depth;
    }
}
