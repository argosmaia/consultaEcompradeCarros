package modelo;
import modelo.Carro;

public class DocumentosCarro extends Carro {
	private Carro carro;
	private String crvl; // certificado de registro e licenciamento do veiculo
	private String cht; // certificado de homologacao do tipo
	private String cmt; // certificado de modelo e tipo
	private String cfc; // certificado de fabricacao do carro
	private String cdpf; // certificado de distribuicao de produto fabricado
	private String cdc; // certificado de distribuicao de combustivel
	private String cdcf; // certificado de distribuicao de combustivel fabricado
	private String cdcv; // certificado de distribuicao de combustivel veicular

	public DocumentosCarro() { // construtor vazio
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param placa
	 * @param marca
	 * @param ano
	 * @param condicao
	 * @param kilom
	 * @param cavalos
	 * @param carro
	 * @param crvl
	 * @param cht
	 * @param cmt
	 * @param cfc
	 * @param cdpf
	 * @param cdc
	 * @param cdcf
	 * @param cdcv
	*/
	public DocumentosCarro(String placa, String marca, String ano, String condicao, String kilom, String cavalos, Carro carro, String crvl) { // construtor com parametros
		super(placa, marca, ano, condicao, kilom, cavalos); // construtor com parametros
		// TODO Auto-generated constructor stub
		this.carro = carro;
		this.crvl = crvl;
		this.cht = cht;
		this.cmt = cmt;
		this.cfc = cfc;
		this.cdpf = cdpf;
		this.cdc = cdc;
		this.cdcf = cdcf;
		this.cdcv = cdcv;
	}

	/**
	 * @return the carro
	 */
	public Carro getCarro() {
		return carro;
	}

	/**
	 * @param carro the carro to set
	 */
	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	/**
	 * @return the crvl
	 */
	public String getCrvl() {
		return crvl;
	}

	/**
	 * @param crvl the crvl to set
	 */
	public void setCrvl(String crvl) {
		this.crvl = crvl;
	}

	/**
	 * @return the cht
	 */
	public String getCht() {
		return cht;
	}

	/**
	 * @param cht the cht to set
	 */
	public void setCht(String cht) {
		this.cht = cht;
	}

	/**
	 * @return the cmt
	 */
	public String getCmt() {
		return cmt;
	}

	/**
	 * @param cmt the cmt to set
	 */
	public void setCmt(String cmt) {
		this.cmt = cmt;
	}

	/**
	 * @return the cfc
	 */
	public String getCfc() {
		return cfc;
	}

	/**
	 * @param cfc the cfc to set
	 */
	public void setCfc(String cfc) {
		this.cfc = cfc;
	}

	/**
	 * @return the cdpf
	 */
	public String getCdpf() {
		return cdpf;
	}

	/**
	 * @param cdpf the cdpf to set
	 */
	public void setCdpf(String cdpf) {
		this.cdpf = cdpf;
	}

	/**
	 * @return the cdc
	 */
	public String getCdc() {
		return cdc;
	}

	/**
	 * @param cdc the cdc to set
	 */
	public void setCdc(String cdc) {
		this.cdc = cdc;
	}

	/**
	 * @return the cdcf
	 */
	public String getCdcf() {
		return cdcf;
	}

	/**
	 * @param cdcf the cdcf to set
	 */
	public void setCdcf(String cdcf) {
		this.cdcf = cdcf;
	}

	/**
	 * @return the cdcv
	 */
	public String getCdcv() {
		return cdcv;
	}

	/**
	 * @param cdcv the cdcv to set
	 */
	public void setCdcv(String cdcv) {
		this.cdcv = cdcv;
	}
	
}
