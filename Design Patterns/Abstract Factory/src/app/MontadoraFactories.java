package app;
public class MontadoraFactories 
{
    public static MontadoraFactory obterFabrica( String nomeClasse )
    {
        MontadoraFactory fabrica = null;

        try 
        {
            fabrica = (MontadoraFactory) Class.forName(nomeClasse).newInstance();
        } 
        catch (Exception ex)  { }
        
        return fabrica;
    }
}