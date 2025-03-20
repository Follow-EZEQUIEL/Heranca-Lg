public class ProgExc {

    public static void main(String args[]){

        System.out.println("####################");
        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setNome("Ezequiel ");
        pessoa.setSobrenome("Amorim: ");
        pessoa.setCpf(Double.valueOf(" 1 "));
        pessoa.setRg(" 2 ");
        pessoa.setEstado("São Paulo ");
        pessoa.setEmprego("Repositor de mercado ");
        pessoa.setSalario(1900d );
        System.out.println(pessoa.getNome() + pessoa.getSobrenome());
        System.out.println("CPF " + pessoa.getCpf() + " RG" + pessoa.getRg());
        System.out.println("Mora em " + pessoa.getEstado());
        System.out.println("Atua na área de trabalho como " + pessoa.getEmprego() + "Recebe um valor de " + pessoa.getSalario());
        System.out.println("####################");

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Lucas");
        pessoaJuridica.setSobrenome("Felisbino");
        pessoaJuridica.setEmpresa("Sempre da bug");
        pessoaJuridica.setMei("222");
        pessoaJuridica.setCnpj(Long.valueOf("12443"));
        System.out.println(pessoaJuridica.getNome() + pessoaJuridica.getSobrenome());
        System.out.println("Proprietario da emoresa " + pessoaJuridica.getEmpresa());
        System.out.println("CNPJ " + pessoaJuridica.getCnpj());
        System.out.println("MEI " + pessoaJuridica.getMei());




    }


}
