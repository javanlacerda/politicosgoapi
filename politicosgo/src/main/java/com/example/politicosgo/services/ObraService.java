package com.example.politicosgo.services;

import java.util.ArrayList;
import java.util.Collection;

import com.example.politicosgo.bdinterfaces.ObraRepository;
import com.example.politicosgo.entities.Obra;
import com.example.politicosgo.utils.CSVController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ObraService {
   
    @Autowired
    private ObraRepository oRepository;

    public CSVController csv = new CSVController();

    public Collection<Obra> getObras() {
       
        return this.oRepository.findAll();

    }

    public ResponseEntity<String> putObra(Obra obra) {

        try {
            this.oRepository.save(obra);
            return new ResponseEntity<>("Obra cadastrada!", HttpStatus.OK);

        } catch (Exception e) {

            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        }
    }

    public ResponseEntity<String> updateObra(Obra obra) {

        try {
            this.oRepository.save(obra);
            return new ResponseEntity<>("Obra atualizada!", HttpStatus.OK);

        } catch (Exception e) {

            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        }
    }

    public ResponseEntity<String> deleteObra(Long id) {

        try {
            this.oRepository.deleteById(id);
            return new ResponseEntity<>("Obra deletada!", HttpStatus.OK);

        } catch (Exception e) {

            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        }

    }

    public void deleteAll() {

        this.oRepository.deleteAll();
    }

    public Double myParseDouble(String str) {
        return str.trim().equals("") ? null : Double.parseDouble(str);
    }

    public Long myParseLong(String str) {
        return str.trim().equals("") ? null : Long.parseLong(str);
    }

    // public void importObras() {

    //     deleteAll();

    //     ArrayList<String[]> obras = csv.run("obras.csv");
    //     for (String[] obra : obras) {

    //         if (obra.length != 57) continue;
            
    //         String uf = obra[4];

    //         if (!uf.equalsIgnoreCase("pb")) continue;
    //         Long id = myParseLong(obra[0]);
    //         String name = obra[1];
    //         String situacao = obra[2];
    //         String municipio = obra[3];
            
    //         String cep = obra[5];
    //         String logradouro = obra[6];
    //         String bairro = obra[7];
    //         String termo = obra[8];
    //         String fimConvenio = obra[9];
    //         String situacaoConvenio = obra[10];
    //         Double percentualExecucao = myParseDouble(obra[11]);
    //         String previsaoConcolusao = obra[12];
    //         String tipoEnsino = obra[13];
    //         String tipoProj = obra[14];
    //         String tipoObra = obra[15];
    //         String classificacaoObra = obra[16];
    //         Double valorFNDE = myParseDouble(obra[17]);
    //         String redeDeEnsino = obra[18];
    //         Long cnpj = myParseLong(obra[19]);
    //         String inscricaoEstadual = obra[20];
    //         String nomeEntidade = obra[21];
    //         String razaoSocial = obra[22];
    //         String email = obra[23];
    //         String sigla = obra[24];
    //         String telefone = obra[25];
    //         String fax = obra[26];
    //         String CEPEntidade = obra[27];
    //         String logradouroEntidade = obra[28];
    //         String complementoEntidade = obra[29];
    //         String numeroEntidade = obra[30];
    //         String bairroEntidade = obra[31];
    //         String ufEntidade = obra[32];
    //         String municipioEntidade = obra[33];
    //         String modalidadeLicitacao = obra[34];
    //         String numeroLicitacao = obra[35];
    //         String homologacaoLicitacao = obra[36];
    //         String empresaContratada = obra[37];
    //         String dataDeAssinaturaContrato = obra[38];
    //         String prazoVigencia = obra[39];
    //         String dataTerminoContrato = obra[40];
    //         Double valorContrato = myParseDouble(obra[41]);
    //         Double valorPactuadoFNDE = myParseDouble(obra[42]);
    //         String dataUltimVistoria = obra[43];
    //         String situacaoVistoria = obra[44];
    //         String obs = obra[45];
    //         String totalPago = obra[46];
    //         String percentualPago = obra[47];
    //         Long banco = myParseLong(obra[48]);
    //         Long agencia = myParseLong(obra[49]);
    //         String conta = obra[50];
    //         String data = obra[51];
    //         Double saldoConta = myParseDouble(obra[52]);
    //         Double saldoFundos = myParseDouble(obra[53]);
    //         Double saldoPoupanca = myParseDouble(obra[54]);
    //         Double saldoCdb = myParseDouble(obra[55]);
    //         Double saldoTotal = myParseDouble(obra[56]);

    //         Obra obraObj = new Obra(id, name, situacao, municipio, uf, cep, logradouro, bairro, termo, fimConvenio,
    //                 situacaoConvenio, percentualExecucao, previsaoConcolusao, tipoEnsino, tipoProj, tipoObra,
    //                 classificacaoObra, valorFNDE, redeDeEnsino, cnpj, inscricaoEstadual, nomeEntidade, razaoSocial,
    //                 email, sigla, telefone, fax, CEPEntidade, logradouroEntidade, complementoEntidade, numeroEntidade,
    //                 bairroEntidade, ufEntidade, municipioEntidade, modalidadeLicitacao, numeroLicitacao,
    //                 homologacaoLicitacao, empresaContratada, dataDeAssinaturaContrato, prazoVigencia,
    //                 dataTerminoContrato, valorContrato, valorPactuadoFNDE, dataUltimVistoria, situacaoVistoria, obs,
    //                 totalPago, percentualPago, banco, agencia, conta, data, saldoConta, saldoFundos, saldoPoupanca,
    //                 saldoCdb, saldoTotal);

    //         putObra(obraObj);

    //     }
    // }
}