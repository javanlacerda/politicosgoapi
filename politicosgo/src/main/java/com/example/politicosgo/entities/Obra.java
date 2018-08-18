package com.example.politicosgo.entities;

import org.springframework.data.annotation.Id;

public class Obra {

	@Id
	private Long id;

	private Double latitude;

	private Double longitude;

	private String name;

	private String situacao;

	private String municipio;

	private String uf;

	private String cep;

	private String logradouro;

	private String bairro;

	private String termo;

	private String fimConvenio;

	private String situacaoConvenio;

	private Double percentualExecucao;

	private String previsaoConcolusao;

	private String tipoEnsino;

	private String tipoProj;

	private String tipoObra;

	private String classificacaoObra;

	private Double valorFNDE;

	private String redeDeEnsino;

	private Long cnpj;

	private String inscricaoEstadual;

	private String nomeEntidade;

	private String razaoSocial;

	private String email;

	private String sigla;

	private String telefone;

	private String fax;

	private String CEPEntidade;

	private String logradouroEntidade;

	private String complementoEntidade;

	private String numeroEntidade;

	private String bairroEntidade;

	private String ufEntidade;

	private String municipioEntidade;

	private String modalidadeLicitacao;

	private String numeroLicitacao;

	private String homologacaoLicitacao;

	private String empresaContratada;

	private String dataDeAssinaturaContrato;

	private String prazoVigencia;

	private String dataTerminoContrato;

	private Double valorContrato;

	private Double valorPactuadoFNDE;

	private String dataUltimVistoria;

	private String situacaoVistoria;

	private String obs;

	private String totalPago;

	private String percentualPago;

	private Long banco;

	private Long agencia;

	private String conta;

	private String data;

	private Double saldoConta;

	private Double saldoFundos;

	private Double saldoPoupanca;

	private Double saldoCdb;

	private Double saldoTotal;

	public Obra(Long id, Double latitude, Double longitude, String name, String situacao, String municipio, String uf, String cep, String logradouro, String bairro, String termo, String fimConvenio, String situacaoConvenio, Double percentualExecucao, String previsaoConcolusao, String tipoEnsino, String tipoProj, String tipoObra, String classificacaoObra, Double valorFNDE, String redeDeEnsino, Long cnpj, String inscricaoEstadual, String nomeEntidade, String razaoSocial, String email, String sigla, String telefone, String fax, String CEPEntidade, String logradouroEntidade, String complementoEntidade, String numeroEntidade, String bairroEntidade, String ufEntidade, String municipioEntidade, String modalidadeLicitacao, String numeroLicitacao, String homologacaoLicitacao, String empresaContratada, String dataDeAssinaturaContrato, String prazoVigencia, String dataTerminoContrato, Double valorContrato, Double valorPactuadoFNDE, String dataUltimVistoria, String situacaoVistoria, String obs, String totalPago, String percentualPago, Long banco, Long agencia, String conta, String data, Double saldoConta, Double saldoFundos, Double saldoPoupanca, Double saldoCdb, Double saldoTotal) {
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.name = name;
		this.situacao = situacao;
		this.municipio = municipio;
		this.uf = uf;
		this.cep = cep;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.termo = termo;
		this.fimConvenio = fimConvenio;
		this.situacaoConvenio = situacaoConvenio;
		this.percentualExecucao = percentualExecucao;
		this.previsaoConcolusao = previsaoConcolusao;
		this.tipoEnsino = tipoEnsino;
		this.tipoProj = tipoProj;
		this.tipoObra = tipoObra;
		this.classificacaoObra = classificacaoObra;
		this.valorFNDE = valorFNDE;
		this.redeDeEnsino = redeDeEnsino;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.nomeEntidade = nomeEntidade;
		this.razaoSocial = razaoSocial;
		this.email = email;
		this.sigla = sigla;
		this.telefone = telefone;
		this.fax = fax;
		this.CEPEntidade = CEPEntidade;
		this.logradouroEntidade = logradouroEntidade;
		this.complementoEntidade = complementoEntidade;
		this.numeroEntidade = numeroEntidade;
		this.bairroEntidade = bairroEntidade;
		this.ufEntidade = ufEntidade;
		this.municipioEntidade = municipioEntidade;
		this.modalidadeLicitacao = modalidadeLicitacao;
		this.numeroLicitacao = numeroLicitacao;
		this.homologacaoLicitacao = homologacaoLicitacao;
		this.empresaContratada = empresaContratada;
		this.dataDeAssinaturaContrato = dataDeAssinaturaContrato;
		this.prazoVigencia = prazoVigencia;
		this.dataTerminoContrato = dataTerminoContrato;
		this.valorContrato = valorContrato;
		this.valorPactuadoFNDE = valorPactuadoFNDE;
		this.dataUltimVistoria = dataUltimVistoria;
		this.situacaoVistoria = situacaoVistoria;
		this.obs = obs;
		this.totalPago = totalPago;
		this.percentualPago = percentualPago;
		this.banco = banco;
		this.agencia = agencia;
		this.conta = conta;
		this.data = data;
		this.saldoConta = saldoConta;
		this.saldoFundos = saldoFundos;
		this.saldoPoupanca = saldoPoupanca;
		this.saldoCdb = saldoCdb;
		this.saldoTotal = saldoTotal;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSituacao() {
		return this.situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getTermo() {
		return this.termo;
	}

	public void setTermo(String termo) {
		this.termo = termo;
	}

	public String getFimConvenio() {
		return this.fimConvenio;
	}

	public void setFimConvenio(String fimConvenio) {
		this.fimConvenio = fimConvenio;
	}

	public String getSituacaoConvenio() {
		return this.situacaoConvenio;
	}

	public void setSituacaoConvenio(String situacaoConvenio) {
		this.situacaoConvenio = situacaoConvenio;
	}

	public Double getPercentualExecucao() {
		return this.percentualExecucao;
	}

	public void setPercentualExecucao(Double percentualExecucao) {
		this.percentualExecucao = percentualExecucao;
	}

	public String getPrevisaoConcolusao() {
		return this.previsaoConcolusao;
	}

	public void setPrevisaoConcolusao(String previsaoConcolusao) {
		this.previsaoConcolusao = previsaoConcolusao;
	}

	public String getTipoEnsino() {
		return this.tipoEnsino;
	}

	public void setTipoEnsino(String tipoEnsino) {
		this.tipoEnsino = tipoEnsino;
	}

	public String getTipoProj() {
		return this.tipoProj;
	}

	public void setTipoProj(String tipoProj) {
		this.tipoProj = tipoProj;
	}

	public String getTipoObra() {
		return this.tipoObra;
	}

	public void setTipoObra(String tipoObra) {
		this.tipoObra = tipoObra;
	}

	public String getClassificacaoObra() {
		return this.classificacaoObra;
	}

	public void setClassificacaoObra(String classificacaoObra) {
		this.classificacaoObra = classificacaoObra;
	}

	public Double getValorFNDE() {
		return this.valorFNDE;
	}

	public void setValorFNDE(Double valorFNDE) {
		this.valorFNDE = valorFNDE;
	}

	public String getRedeDeEnsino() {
		return this.redeDeEnsino;
	}

	public void setRedeDeEnsino(String redeDeEnsino) {
		this.redeDeEnsino = redeDeEnsino;
	}

	public Long getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return this.inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getNomeEntidade() {
		return this.nomeEntidade;
	}

	public void setNomeEntidade(String nomeEntidade) {
		this.nomeEntidade = nomeEntidade;
	}

	public String getRazaoSocial() {
		return this.razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getCEPEntidade() {
		return this.CEPEntidade;
	}

	public void setCEPEntidade(String CEPEntidade) {
		this.CEPEntidade = CEPEntidade;
	}

	public String getLogradouroEntidade() {
		return this.logradouroEntidade;
	}

	public void setLogradouroEntidade(String logradouroEntidade) {
		this.logradouroEntidade = logradouroEntidade;
	}

	public String getComplementoEntidade() {
		return this.complementoEntidade;
	}

	public void setComplementoEntidade(String complementoEntidade) {
		this.complementoEntidade = complementoEntidade;
	}

	public String getNumeroEntidade() {
		return this.numeroEntidade;
	}

	public void setNumeroEntidade(String numeroEntidade) {
		this.numeroEntidade = numeroEntidade;
	}

	public String getBairroEntidade() {
		return this.bairroEntidade;
	}

	public void setBairroEntidade(String bairroEntidade) {
		this.bairroEntidade = bairroEntidade;
	}

	public String getUfEntidade() {
		return this.ufEntidade;
	}

	public void setUfEntidade(String ufEntidade) {
		this.ufEntidade = ufEntidade;
	}

	public String getMunicipioEntidade() {
		return this.municipioEntidade;
	}

	public void setMunicipioEntidade(String municipioEntidade) {
		this.municipioEntidade = municipioEntidade;
	}

	public String getModalidadeLicitacao() {
		return this.modalidadeLicitacao;
	}

	public void setModalidadeLicitacao(String modalidadeLicitacao) {
		this.modalidadeLicitacao = modalidadeLicitacao;
	}

	public String getNumeroLicitacao() {
		return this.numeroLicitacao;
	}

	public void setNumeroLicitacao(String numeroLicitacao) {
		this.numeroLicitacao = numeroLicitacao;
	}

	public String getHomologacaoLicitacao() {
		return this.homologacaoLicitacao;
	}

	public void setHomologacaoLicitacao(String homologacaoLicitacao) {
		this.homologacaoLicitacao = homologacaoLicitacao;
	}

	public String getEmpresaContratada() {
		return this.empresaContratada;
	}

	public void setEmpresaContratada(String empresaContratada) {
		this.empresaContratada = empresaContratada;
	}

	public String getDataDeAssinaturaContrato() {
		return this.dataDeAssinaturaContrato;
	}

	public void setDataDeAssinaturaContrato(String dataDeAssinaturaContrato) {
		this.dataDeAssinaturaContrato = dataDeAssinaturaContrato;
	}

	public String getPrazoVigencia() {
		return this.prazoVigencia;
	}

	public void setPrazoVigencia(String prazoVigencia) {
		this.prazoVigencia = prazoVigencia;
	}

	public String getDataTerminoContrato() {
		return this.dataTerminoContrato;
	}

	public void setDataTerminoContrato(String dataTerminoContrato) {
		this.dataTerminoContrato = dataTerminoContrato;
	}

	public Double getValorContrato() {
		return this.valorContrato;
	}

	public void setValorContrato(Double valorContrato) {
		this.valorContrato = valorContrato;
	}

	public Double getValorPactuadoFNDE() {
		return this.valorPactuadoFNDE;
	}

	public void setValorPactuadoFNDE(Double valorPactuadoFNDE) {
		this.valorPactuadoFNDE = valorPactuadoFNDE;
	}

	public String getDataUltimVistoria() {
		return this.dataUltimVistoria;
	}

	public void setDataUltimVistoria(String dataUltimVistoria) {
		this.dataUltimVistoria = dataUltimVistoria;
	}

	public String getSituacaoVistoria() {
		return this.situacaoVistoria;
	}

	public void setSituacaoVistoria(String situacaoVistoria) {
		this.situacaoVistoria = situacaoVistoria;
	}

	public String getObs() {
		return this.obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getTotalPago() {
		return this.totalPago;
	}

	public void setTotalPago(String totalPago) {
		this.totalPago = totalPago;
	}

	public String getPercentualPago() {
		return this.percentualPago;
	}

	public void setPercentualPago(String percentualPago) {
		this.percentualPago = percentualPago;
	}

	public Long getBanco() {
		return this.banco;
	}

	public void setBanco(Long banco) {
		this.banco = banco;
	}

	public Long getAgencia() {
		return this.agencia;
	}

	public void setAgencia(Long agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return this.conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Double getSaldoConta() {
		return this.saldoConta;
	}

	public void setSaldoConta(Double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public Double getSaldoFundos() {
		return this.saldoFundos;
	}

	public void setSaldoFundos(Double saldoFundos) {
		this.saldoFundos = saldoFundos;
	}

	public Double getSaldoPoupanca() {
		return this.saldoPoupanca;
	}

	public void setSaldoPoupanca(Double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

	public Double getSaldoCdb() {
		return this.saldoCdb;
	}

	public void setSaldoCdb(Double saldoCdb) {
		this.saldoCdb = saldoCdb;
	}

	public Double getSaldoTotal() {
		return this.saldoTotal;
	}

	public void setSaldoTotal(Double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	
}