package task.Zada7;

public class PointController {



    public Point addX(Point point){
        point.setPointX(point.getPointX() + 1);
        return point;
    }

    public Point minusX(Point point){
        point.setPointX(point.getPointX() - 1);
        return point;
    }

    public Point addY(Point point){
        point.setPointY(point.getPointY() + 1);
        return point;
    }

    public Point minusY(Point point){
        point.setPointY(point.getPointY() - 1);
        return point;
    }
}
