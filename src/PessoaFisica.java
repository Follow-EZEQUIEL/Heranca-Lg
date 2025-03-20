public class PessoaFisica extends Pessoa{

    private String emprego;
    private Double salario;

    public String getEmprego() {
        return emprego;
    }

    public void setEmprego(String emprego) {
        this.emprego = emprego;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getSobrenome() {
        return "Felisbino";
    }
}
