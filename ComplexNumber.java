class MyComplex {
  private double real;
  private double imag;

  public MyComplex(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }

  public double getReal() {
    return real;
  }

  public void setReal(double real) {
    this.real = real;
  }

  public double getImag(double imag) {
    return imag;
  }

  public void setValue(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }

  public String toString() {
    return "(" + real + " + " + imag + "i" + ")";
  }

  public boolean isReal() {
    if (real > 0)
      return true;
    return false;
  }

  public boolean isImaginary() {
    if (imag > 0)
      return true;
    return false;
  }

  public double getImag() {
    return imag;
  }

  public boolean equals(double real, double imag) {
    return this.real == real && this.imag == imag;
  }

  public boolean equals(MyComplex another) {
    return another.real == another.imag;
  }

  public double magnitude() {

    return Math.sqrt(real * real + imag * imag);
  }

  public double argumentInRadians() {
    double ans;
    if (real < 0 && imag > 0) {
      ans = Math.PI / 2 + Math.atan2(imag, -real);
    } else if (real < 0 && imag < 0) {
      ans = Math.PI + Math.atan2(-imag, -real);
    } else if (real > 0 && imag > 0) {
      ans = Math.atan2(imag, real);
    } else {
      ans = 2 * Math.PI - Math.atan2(-imag, real);
    }
    return Math.toRadians(ans);
  }

  public double argumentInnDegrees() {
    double ans;
    if (real < 0 && imag > 0) {
      ans = Math.PI / 2 + Math.atan2(imag, -real);
    } else if (real < 0 && imag < 0) {
      ans = Math.PI + Math.atan2(-imag, -real);
    } else if (real > 0 && imag > 0) {
      ans = Math.atan2(imag, real);
    } else {
      ans = 2 * Math.PI - Math.atan2(-imag, real);
    }

    return Math.toDegrees(ans);
  }

  public MyComplex conjugate() {
    return new MyComplex(this.real, -this.imag);
  }

  public MyComplex add(MyComplex another) {
    return new MyComplex(another.real + this.real, another.imag + this.imag);
  }

  public MyComplex subtract(MyComplex another) {
    return new MyComplex(this.real - another.real, this.imag - another.imag);
  }

  public MyComplex multiplyWith(MyComplex another) {
    return new MyComplex((this.real * another.real - this.imag * another.imag),
        (this.imag * another.real + this.real * another.imag));
  }

  public MyComplex divideBy(MyComplex anohter) {
    double a = (this.real * anohter.real - this.imag * anohter.imag)
        / (anohter.real * anohter.real + anohter.imag * anohter.imag);
    double b = (this.imag * anohter.real + this.real * anohter.imag)
        / (anohter.real * anohter.real + anohter.imag * anohter.imag);
    return new MyComplex(a, b);
  }
}

public class ComplexNumber {
  public static void main(String[] args) {
    MyComplex c = new MyComplex(3, 4);
    MyComplex d = new MyComplex(7, 8);
    MyComplex e = c.multiplyWith(d);
    System.out.println(e.toString());
    e = c.add(d);
    System.out.println(e.toString());
  }
}
