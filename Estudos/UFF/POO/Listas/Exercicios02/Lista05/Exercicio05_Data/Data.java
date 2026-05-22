public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }


    public boolean dataValida() {
        if (ano <= 0) {
            return false;
        }

        if (mes < 1 || mes > 12) {
            return false;
        }

        int maxDias = obterLimiteDiasMes();
        
        if (dia < 1 || dia > maxDias) {
            return false;
        }

        return true;
    }


    public boolean anoBissexto() {
        if (!dataValida()) {
            return false;
        }
        
        // Regra do ano bissexto: divisível por 4 e não divisível por 100, 
        // OU divisível por 400.
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }


    
    public void imprime() {
        imprime("/");
    }


    public void imprime(String separador) {
        if (!dataValida()) {
            System.out.println("INVÁLIDA");
        } else {
            String diaFormatado = String.format("%02d", dia);
            String mesFormatado = String.format("%02d", mes);
            System.out.println(diaFormatado + separador + mesFormatado + separador + ano);
        }
    }


    private int obterLimiteDiasMes() {
        switch (mes) {
            case 2:
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    return 29;
                }
                return 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        }
    }
}