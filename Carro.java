public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int quilometragem;

    
    public Carro(String marca, String modelo, int anoFabricacao, int quilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    
    public Carro() {
        this.marca = "";
        this.modelo = "";
        this.anoFabricacao = 0;
        this.quilometragem = 0;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    
    public void adicionarQuilometragem(int quilometros) {
        this.quilometragem += quilometros;
    }

    
    public void subtrairQuilometragem(int quilometros) {
        this.quilometragem -= quilometros;
    }

    
    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + ", anoFabricacao=" + anoFabricacao + ", quilometragem=" + quilometragem + "]";
        }
    }        