package ua.kh.nure.baklanov;
import java.util.*;
import org.apache.commons.math3.optim.MaxIter;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.linear.LinearConstraint;
import org.apache.commons.math3.optim.linear.LinearConstraintSet;
import org.apache.commons.math3.optim.linear.LinearObjectiveFunction;
import org.apache.commons.math3.optim.linear.NonNegativeConstraint;
import org.apache.commons.math3.optim.linear.Relationship;
import org.apache.commons.math3.optim.linear.SimplexSolver;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;

public class SimplexMethod {

    /**
     *
     * @param A ресурсы на выпуск всех товаров (юнитов) [номер ресурса][номер юнита]
     * @param b предел ресурсов (ограничение)
     * @param c выгода
     * @return суммарная выгода плана x
     */

    public static double[] simplexDoubleMaximize(double[][] A, double[] b, double[] c, String[]rel) {

//    return justOneMaximize(A,b,c, x); // maybe fast, but not precission
        double[] x = new double[A.length];
        // - - -
        LinearObjectiveFunction f = new LinearObjectiveFunction(c, 0); // !!!

        ArrayList<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        for(int i=0; i<A.length; i++) { // Ограничения
            if (rel[i].equals(Relationship.LEQ.toString())){
                constraints.add( new LinearConstraint(A[i], Relationship.LEQ, b[i]) );
            }
            else if (rel[i].equals(Relationship.GEQ.toString()))
            {
                constraints.add( new LinearConstraint(A[i], Relationship.GEQ, b[i]) );
            }
            else if (rel[i].equals(Relationship.EQ.toString()))
            {
                constraints.add( new LinearConstraint(A[i], Relationship.EQ, b[i]) );
            }
            double[] zeroV = new double[A[i].length];
            Arrays.fill(zeroV, 0);
            constraints.add( new LinearConstraint(zeroV, Relationship.GEQ, 0) ); // _c[i]*x[i]<=V_Res[i]
        }
        // TODO при переработке энергии в металл можно учесть с помощью двух переменных и ограничения!!!

        // FIXME precission - do not use between 0.00001 and 1.0, only 1,2,3...

        SimplexSolver solver = new SimplexSolver();
        try {
            PointValuePair optSolution = solver.optimize(new MaxIter(1000), f,
                    new LinearConstraintSet(constraints),
                    GoalType.MAXIMIZE,
                    new NonNegativeConstraint(true));
            //double[] solution = optSolution.getPoint();
            double[] x_=optSolution.getPointRef(); // TODO it is bad fix for n*1.0. To do iteration.
            for(int i=0;i<x_.length;i++)
            {
                System.out.println("x"+i+" равно "+x_[i]);
            }
            //for (int i=0;i<x_.length;i++) if (x_[i]>0) x_[i]=Math.round(x_[i]-0.5);
            //System.arraycopy(x_, 0, x, 0, x.length);
            double[]result= new double[x_.length+1];
            System.arraycopy (x_, 0, result, 1, 5);
            result[0]=optSolution.getValue();
            System.out.println(optSolution.getValue());
            return result;
        }
       catch (Exception e)
       {
           System.out.println("Исходная задача не имеет опорного плана!");
       }

        // - - -
        return null;
    }

    public static double[] simplexDoubleMinimize(double[][] A, double[] b, double[] c, String[]rel) {

//    return justOneMaximize(A,b,c, x); // maybe fast, but not precission
        double[] x = new double[A.length];
        // - - -
        LinearObjectiveFunction f = new LinearObjectiveFunction(c, 0); // !!!

        ArrayList<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        for(int i=0; i<A.length; i++) { // Ограничения
            if (rel[i].equals(Relationship.LEQ.toString())){
                constraints.add( new LinearConstraint(A[i], Relationship.LEQ, b[i]) );
            }
            else if (rel[i].equals(Relationship.GEQ.toString()))
            {
                constraints.add( new LinearConstraint(A[i], Relationship.GEQ, b[i]) );
            }
            else if (rel[i].equals(Relationship.EQ.toString()))
            {
                constraints.add( new LinearConstraint(A[i], Relationship.EQ, b[i]) );
            }
            double[] zeroV = new double[A[i].length];
            Arrays.fill(zeroV, 0);
            constraints.add( new LinearConstraint(zeroV, Relationship.LEQ, 0) ); // _c[i]*x[i]<=V_Res[i]
        }
        // TODO при переработке энергии в металл можно учесть с помощью двух переменных и ограничения!!!

        // FIXME precission - do not use between 0.00001 and 1.0, only 1,2,3...

        SimplexSolver solver = new SimplexSolver();
        PointValuePair optSolution;
        try {
                    optSolution = solver.optimize(new MaxIter(1000), f,
                    new LinearConstraintSet(constraints),
                    GoalType.MINIMIZE,
                    new NonNegativeConstraint(true));
                    double[] x_=optSolution.getPointRef(); // TODO it is bad fix for n*1.0. To do iteration.
            for(int i=0;i<x_.length;i++)
            {
                System.out.println("x"+i+" равно "+x_[i]);
            }
           // for (int i=0;i<x_.length;i++) if (x_[i]>0) x_[i]=Math.round(x_[i]-0.5);

            //System.arraycopy(x_, 0, x, 0, x.length);
            double[]result= new double[x_.length+1];
            System.arraycopy (x_, 0, result, 1, 5);
            result[0]=optSolution.getValue();
            System.out.println(optSolution.getValue());
            return result;
        }

 catch (Exception e)
        {
            System.out.println("Исходная задача не имеет опорного плана!");
        }
        //double[] solution = optSolution.getPoint();



        // - - -
        return null;
    }


    public static void main(double[][]A, double []B, double []C)
    {
        //double[][] A = {{9,2,3,4,0}, {3,10,5,1,0}, {6,7,11,5,1}, {2,4,5,2,1},{4,2,1,1,1}};
        double[] x = new double[A.length];
        //double[] c = {5,2,4,3,9};
        //double[] B = {1,2,3,4,1};
    }


}
//x_ = корни
