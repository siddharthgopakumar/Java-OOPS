import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        // Put code here
        int NumPoints=0;
        for(Point currPt:s.getPoints())
        {NumPoints=NumPoints+1;
        }
        return NumPoints;
    }

    public double getAverageLength(Shape s) {
        double length = getPerimeter(s);
        int NPoints= getNumPoints(s);
        double ALength=length/NPoints;
        // Put code here
        return ALength;
    }

    public double getLargestSide(Shape s) {
        double prevDist=0;
        Point prevPt=s.getLastPoint();
        for(Point currPt: s.getPoints())
        {
            double currDist=prevPt.distance(currPt);
            if(currDist>prevDist)
            {prevDist=currDist;}
            prevPt=currPt;
        }// Put code here
        return prevDist ;
    }

    public double getLargestX(Shape s) {
        Point prevPt=s.getLastPoint();
        for(Point currPt:s.getPoints())
        {
            if (currPt.getX()>prevPt.getX())
            {
                prevPt=currPt;
            }
        }
        double largestX=prevPt.getX();
        // Put code here
        return largestX;
    }

    public double getLargestPerimeterMultipleFiles() {
        double largestP=0;
        DirectoryResource dr=new DirectoryResource();
        for(File f: dr.selectedFiles())
        {
            FileResource fr=new FileResource(f);
            Shape s= new Shape(fr);
            if(largestP<getPerimeter(s))
            {
                largestP=getPerimeter(s);
            }
        }
        // Put code here
        return largestP;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        File temp = null;
        double largestP=0;
        DirectoryResource dr=new DirectoryResource();
        for(File f: dr.selectedFiles())
        {
            FileResource fr=new FileResource(f);
            Shape s= new Shape(fr);
            if(largestP<getPerimeter(s))
            {
                largestP=getPerimeter(s);
                temp=f;
            }
        }
        // replace this code
        return temp.getName();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
        int NPoints= getNumPoints(s);
        System.out.println("Number of points=" + NPoints);
        System.out.println("Average Length=" + getAverageLength(s));
        System.out.println("The Longest side=" + getLargestSide(s));
        System.out.println("The Largest X=" + getLargestX(s));
    }
    
    public void testPerimeterMultipleFiles() {
        System.out.println("Largest perimeter among the files= " + getLargestPerimeterMultipleFiles());
        System.out.println("File with the largest perimeter is "+getFileWithLargestPerimeter());// Put code here
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
    }
}
