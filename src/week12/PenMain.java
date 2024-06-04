package week12;

class Pen {
    int amount;
    public int getAmount() {
        return this.amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
}

class BallPoint extends Pen {
    private String color;

	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

class FountainPen extends BallPoint {
    public void refill(int n) {
        setAmount(n);
    }
}

class SharpPencil extends Pen {
    private int width;
}

public class PenMain {
    public static void main(String[] args) {
        
    }
}
