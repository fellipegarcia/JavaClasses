
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import entidades.Usuario;
import utilidades.DataUtil;

 public class App {
	 // --- MAIN = TAG QUE FAZ A CLASSE EXEECUTAR O PROGRAMA
	 // --- OBS - NAO SE DEVE USAR EM TODAS AS CLASSES
	 
	public static void main(String[] args) {
		System.out.println("Ola, sou um programa de locadora!");
		
		List<Usuario> lista = new ArrayList<Usuario>(); 
		
		Usuario x = new Usuario();
		x.setNome("Ananias");
		lista.add(x);
	
		Usuario y = new Usuario();
		y.setNome("João");
		lista.add(y);
		
		Usuario w = new Usuario("Bernardo");
		lista.add(w);
		
		Usuario z = new Usuario("Gabriele");
		lista.add(z);
		
		imprimir(lista);
		usarData();
	}

	public static void imprimir(List<Usuario> lista) {
		for(Usuario u: lista) {
			System.out.println(u);
			
		}

	}

	// --- USANDO METODOS ASSINADOS COMO STATIC (INDICA QUE N PRECISA INSTANCIAR) E VOID (NAO RETORNA VALOR) 
	
	public static void usarData() {
		
		// --- IMPRIMINDO DATA
		// --- (NEW É USADA P/ INSTANCIAR METODOS QUE NAO SAO STATIC 
		
		System.out.println(new Date());
		
		// --- IMPRIMINDO DATA CHAMANDO METODO DE OUTRA CLASSE
		
		System.out.println(DataUtil.obterDataComDiferencaDias(5));
		
		// --- 
		
		String data2 = "08-11-2023";
		SimpleDateFormat fnt = new SimpleDateFormat("dd-MM-yyyy");
		Date data = null;
		
		try {
			data = fnt.parse(data2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(DataUtil.isMesmaData(data, new Date()));
		
		System.out.println(DataUtil.verificarDiaSemana(new Date(), 2));
		
	}
	
}
 
 // --- NAO USAR O STATIC SEMPRE POR OCUPAR MT ESPAÇO E CAUSAR LENTIDAO NO PROGRAMA


















