import Equipamentos.Copiadora.*;
import Equipamentos.Digitalizadora.*;
import Equipamentos.Impressora.*;
import Equipamentos.Multifuncional.EquipamentoMultifuncional;
public class Fabrica 
{
    public static void main(String[] args) 
    {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();


    }    
}
