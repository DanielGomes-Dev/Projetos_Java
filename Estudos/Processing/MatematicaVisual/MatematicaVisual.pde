float escala = 100; // 100 pixels equivalem a 1 unidade na reta

void setup() {
  size(800, 400);
}

void draw() {
  background(30); // Fundo escuro (mais dev friendly)
  translate(width/2, height/2); // Coloca o (0,0) no centro da tela
  
  // Desenha a Reta Real
  stroke(255);
  line(-width/2, 0, width/2, 0);
  
  // Desenha os "ticks" (inteiros)
  for (int i = -4; i <= 4; i++) {
    line(i * escala, -5, i * escala, 5);
    fill(255);
    text(i, i * escala - 3, 20);
  }
  
  // O seu cálculo de 5/2 (decomposição)
  float m = 5;
  float n = 2;
  float ponto = (m / n) * escala;
  
  // Desenha o ponto do Axler
  fill(0, 255, 100); // Verde
  noStroke();
  ellipse(ponto, 0, 15, 15);
  
  fill(0, 255, 100);
  text("m/n = " + (m/n), ponto - 20, -20);
}