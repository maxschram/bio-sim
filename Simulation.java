public class Simulation {
  public static void main(String[] args) {
    StdDraw.setCanvasSize(1400, 800);
    double T = 60;
    double dt = 0.1;

    for(double time=0; time<T; time += dt) {
      //Begin animation mode and render to buffer
      StdDraw.show(0);

      //Clear buffer
      StdDraw.clear();

      //Display buffer on screen
      StdDraw.show(0);
    }
  }
}
