package com.example.politicosgo.entitys;

import org.springframework.data.annotation.Id;

public class Obra {

    @Id
    private int id;

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

    private long CNPJ;

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

    private long numeroLicitacao;

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

    private String banco;

    private int agencia;

    private int conta;

    private String data;

    private double saldoConta;

    private double saldoFundos;

    private double saldoPoupanca;

    private double saldoCDB;

    private double saldoTotal;

	/**
	 * @return the municipioEntidade
	 */
	public String getMunicipioEntidade() {
		return municipioEntidade;
	}

	/**
	 * @return the saldoTotal
	 */
	public double getSaldoTotal() {
		return saldoTotal;
	}

	/**
	 * @param saldoTotal the saldoTotal to set
	 */
	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	/**
	 * @return the saldoCDB
	 */
	public double getSaldoCDB() {
		return saldoCDB;
	}

	/**
	 * @param saldoCDB the saldoCDB to set
	 */
	public void setSaldoCDB(double saldoCDB) {
		this.saldoCDB = saldoCDB;
	}

	/**
	 * @return the saldoPoupanca
	 */
	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	/**
	 * @param saldoPoupanca the saldoPoupanca to set
	 */
	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

	/**
	 * @return the saldoFundos
	 */
	public double getSaldoFundos() {
		return saldoFundos;
	}

	/**
	 * @param saldoFundos the saldoFundos to set
	 */
	public void setSaldoFundos(double saldoFundos) {
		this.saldoFundos = saldoFundos;
	}

	/**
	 * @return the saldoConta
	 */
	public double getSaldoConta() {
		return saldoConta;
	}

	/**
	 * @param saldoConta the saldoConta to set
	 */
	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * @return the conta
	 */
	public int getConta() {
		return conta;
	}

	/**
	 * @param conta the conta to set
	 */
	public void setConta(int conta) {
		this.conta = conta;
	}

	/**
	 * @return the agencia
	 */
	public int getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return the banco
	 */
	public String getBanco() {
		return banco;
	}

	/**
	 * @param banco the banco to set
	 */
	public void setBanco(String banco) {
		this.banco = banco;
	}

	/**
	 * @return the percentualPago
	 */
	public String getPercentualPago() {
		return percentualPago;
	}

	/**
	 * @param percentualPago the percentualPago to set
	 */
	public void setPercentualPago(String percentualPago) {
		this.percentualPago = percentualPago;
	}

	/**
	 * @return the totalPago
	 */
	public String getTotalPago() {
		return totalPago;
	}

	/**
	 * @param totalPago the totalPago to set
	 */
	public void setTotalPago(String totalPago) {
		this.totalPago = totalPago;
	}

	/**
	 * @return the obs
	 */
	public String getObs() {
		return obs;
	}

	/**
	 * @param obs the obs to set
	 */
	public void setObs(String obs) {
		this.obs = obs;
	}

	/**
	 * @return the situacaoVistoria
	 */
	public String getSituacaoVistoria() {
		return situacaoVistoria;
	}

	/**
	 * @param situacaoVistoria the situacaoVistoria to set
	 */
	public void setSituacaoVistoria(String situacaoVistoria) {
		this.situacaoVistoria = situacaoVistoria;
	}

	/**
	 * @return the dataUltimVistoria
	 */
	public String getDataUltimVistoria() {
		return dataUltimVistoria;
	}

	/**
	 * @param dataUltimVistoria the dataUltimVistoria to set
	 */
	public void setDataUltimVistoria(String dataUltimVistoria) {
		this.dataUltimVistoria = dataUltimVistoria;
	}

	/**
	 * @return the valorPactuadoFNDE
	 */
	public Double getValorPactuadoFNDE() {
		return valorPactuadoFNDE;
	}

	/**
	 * @param valorPactuadoFNDE the valorPactuadoFNDE to set
	 */
	public void setValorPactuadoFNDE(Double valorPactuadoFNDE) {
		this.valorPactuadoFNDE = valorPactuadoFNDE;
	}

	/**
	 * @return the valorContrato
	 */
	public Double getValorContrato() {
		return valorContrato;
	}

	/**
	 * @param valorContrato the valorContrato to set
	 */
	public void setValorContrato(Double valorContrato) {
		this.valorContrato = valorContrato;
	}

	/**
	 * @return the dataTerminoContrato
	 */
	public String getDataTerminoContrato() {
		return dataTerminoContrato;
	}

	/**
	 * @param dataTerminoContrato the dataTerminoContrato to set
	 */
	public void setDataTerminoContrato(String dataTerminoContrato) {
		this.dataTerminoContrato = dataTerminoContrato;
	}

	/**
	 * @return the prazoVigencia
	 */
	public String getPrazoVigencia() {
		return prazoVigencia;
	}

	/**
	 * @param prazoVigencia the prazoVigencia to set
	 */
	public void setPrazoVigencia(String prazoVigencia) {
		this.prazoVigencia = prazoVigencia;
	}

	/**
	 * @return the dataDeAssinaturaContrato
	 */
	public String getDataDeAssinaturaContrato() {
		return dataDeAssinaturaContrato;
	}

	/**
	 * @param dataDeAssinaturaContrato the dataDeAssinaturaContrato to set
	 */
	public void setDataDeAssinaturaContrato(String dataDeAssinaturaContrato) {
		this.dataDeAssinaturaContrato = dataDeAssinaturaContrato;
	}

	/**
	 * @return the empresaContratada
	 */
	public String getEmpresaContratada() {
		return empresaContratada;
	}

	/**
	 * @param empresaContratada the empresaContratada to set
	 */
	public void setEmpresaContratada(String empresaContratada) {
		this.empresaContratada = empresaContratada;
	}

	/**
	 * @return the homologacaoLicitacao
	 */
	public String getHomologacaoLicitacao() {
		return homologacaoLicitacao;
	}

	/**
	 * @param homologacaoLicitacao the homologacaoLicitacao to set
	 */
	public void setHomologacaoLicitacao(String homologacaoLicitacao) {
		this.homologacaoLicitacao = homologacaoLicitacao;
	}

	/**
	 * @return the numeroLicitacao
	 */
	public long getNumeroLicitacao() {
		return numeroLicitacao;
	}

	/**
	 * @param numeroLicitacao the numeroLicitacao to set
	 */
	public void setNumeroLicitacao(long numeroLicitacao) {
		this.numeroLicitacao = numeroLicitacao;
	}

	/**
	 * @return the modalidadeLicitacao
	 */
	public String getModalidadeLicitacao() {
		return modalidadeLicitacao;
	}

	/**
	 * @param modalidadeLicitacao the modalidadeLicitacao to set
	 */
	public void setModalidadeLicitacao(String modalidadeLicitacao) {
		this.modalidadeLicitacao = modalidadeLicitacao;
	}

	/**
	 * @return the ufEntidade
	 */
	public String getUfEntidade() {
		return ufEntidade;
	}

	/**
	 * @param ufEntidade the ufEntidade to set
	 */
	public void setUfEntidade(String ufEntidade) {
		this.ufEntidade = ufEntidade;
	}

	/**
	 * @return the bairroEntidade
	 */
	public String getBairroEntidade() {
		return bairroEntidade;
	}

	/**
	 * @param bairroEntidade the bairroEntidade to set
	 */
	public void setBairroEntidade(String bairroEntidade) {
		this.bairroEntidade = bairroEntidade;
	}

	/**
	 * @return the numeroEntidade
	 */
	public String getNumeroEntidade() {
		return numeroEntidade;
	}

	/**
	 * @param numeroEntidade the numeroEntidade to set
	 */
	public void setNumeroEntidade(String numeroEntidade) {
		this.numeroEntidade = numeroEntidade;
	}

	/**
	 * @return the complementoEntidade
	 */
	public String getComplementoEntidade() {
		return complementoEntidade;
	}

	/**
	 * @param complementoEntidade the complementoEntidade to set
	 */
	public void setComplementoEntidade(String complementoEntidade) {
		this.complementoEntidade = complementoEntidade;
	}

	/**
	 * @return the logradouroEntidade
	 */
	public String getLogradouroEntidade() {
		return logradouroEntidade;
	}

	/**
	 * @param logradouroEntidade the logradouroEntidade to set
	 */
	public void setLogradouroEntidade(String logradouroEntidade) {
		this.logradouroEntidade = logradouroEntidade;
	}

	/**
	 * @return the cEPEntidade
	 */
	public String getCEPEntidade() {
		return CEPEntidade;
	}

	/**
	 * @param cEPEntidade the cEPEntidade to set
	 */
	public void setCEPEntidade(String cEPEntidade) {
		this.CEPEntidade = cEPEntidade;
	}

	/**
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * @param fax the fax to set
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * @return the sigla
	 */
	public String getSigla() {
		return sigla;
	}

	/**
	 * @param sigla the sigla to set
	 */
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the razaoSocial
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}

	/**
	 * @param razaoSocial the razaoSocial to set
	 */
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	/**
	 * @return the nomeEntidade
	 */
	public String getNomeEntidade() {
		return nomeEntidade;
	}

	/**
	 * @param nomeEntidade the nomeEntidade to set
	 */
	public void setNomeEntidade(String nomeEntidade) {
		this.nomeEntidade = nomeEntidade;
	}

	/**
	 * @return the inscricaoEstadual
	 */
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	/**
	 * @param inscricaoEstadual the inscricaoEstadual to set
	 */
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	/**
	 * @return the cNPJ
	 */
	public long getCNPJ() {
		return CNPJ;
	}

	/**
	 * @param cNPJ the cNPJ to set
	 */
	public void setCNPJ(long cNPJ) {
		this.CNPJ = cNPJ;
	}

	/**
	 * @return the redeDeEnsino
	 */
	public String getRedeDeEnsino() {
		return redeDeEnsino;
	}

	/**
	 * @param redeDeEnsino the redeDeEnsino to set
	 */
	public void setRedeDeEnsino(String redeDeEnsino) {
		this.redeDeEnsino = redeDeEnsino;
	}

	/**
	 * @return the valorFNDE
	 */
	public Double getValorFNDE() {
		return valorFNDE;
	}

	/**
	 * @param valorFNDE the valorFNDE to set
	 */
	public void setValorFNDE(Double valorFNDE) {
		this.valorFNDE = valorFNDE;
	}

	/**
	 * @return the classificacaoObra
	 */
	public String getClassificacaoObra() {
		return classificacaoObra;
	}

	/**
	 * @param classificacaoObra the classificacaoObra to set
	 */
	public void setClassificacaoObra(String classificacaoObra) {
		this.classificacaoObra = classificacaoObra;
	}

	/**
	 * @return the tipoObra
	 */
	public String getTipoObra() {
		return tipoObra;
	}

	/**
	 * @param tipoObra the tipoObra to set
	 */
	public void setTipoObra(String tipoObra) {
		this.tipoObra = tipoObra;
	}

	/**
	 * @return the tipoProj
	 */
	public String getTipoProj() {
		return tipoProj;
	}

	/**
	 * @param tipoProj the tipoProj to set
	 */
	public void setTipoProj(String tipoProj) {
		this.tipoProj = tipoProj;
	}

	/**
	 * @return the tipoEnsino
	 */
	public String getTipoEnsino() {
		return tipoEnsino;
	}

	/**
	 * @param tipoEnsino the tipoEnsino to set
	 */
	public void setTipoEnsino(String tipoEnsino) {
		this.tipoEnsino = tipoEnsino;
	}

	/**
	 * @return the previsaoConcolusao
	 */
	public String getPrevisaoConcolusao() {
		return previsaoConcolusao;
	}

	/**
	 * @param previsaoConcolusao the previsaoConcolusao to set
	 */
	public void setPrevisaoConcolusao(String previsaoConcolusao) {
		this.previsaoConcolusao = previsaoConcolusao;
	}

	/**
	 * @return the percentualExecucao
	 */
	public Double getPercentualExecucao() {
		return percentualExecucao;
	}

	/**
	 * @param percentualExecucao the percentualExecucao to set
	 */
	public void setPercentualExecucao(Double percentualExecucao) {
		this.percentualExecucao = percentualExecucao;
	}

	/**
	 * @return the situacaoConvenio
	 */
	public String getSituacaoConvenio() {
		return situacaoConvenio;
	}

	/**
	 * @param situacaoConvenio the situacaoConvenio to set
	 */
	public void setSituacaoConvenio(String situacaoConvenio) {
		this.situacaoConvenio = situacaoConvenio;
	}

	/**
	 * @return the fimConvenio
	 */
	public String getFimConvenio() {
		return fimConvenio;
	}

	/**
	 * @param fimConvenio the fimConvenio to set
	 */
	public void setFimConvenio(String fimConvenio) {
		this.fimConvenio = fimConvenio;
	}

	/**
	 * @return the termo
	 */
	public String getTermo() {
		return termo;
	}

	/**
	 * @param termo the termo to set
	 */
	public void setTermo(String termo) {
		this.termo = termo;
	}

	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * @param logradouro the logradouro to set
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * @param cep the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * @return the uf
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * @param uf the uf to set
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

	/**
	 * @return the municipio
	 */
	public String getMunicipio() {
		return municipio;
	}

	/**
	 * @param municipio the municipio to set
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	/**
	 * @return the situacao
	 */
	public String getSituacao() {
		return situacao;
	}

	/**
	 * @param situacao the situacao to set
	 */
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param municipioEntidade the municipioEntidade to set
	 */
	public void setMunicipioEntidade(String municipioEntidade) {
		this.municipioEntidade = municipioEntidade;
	}
















}