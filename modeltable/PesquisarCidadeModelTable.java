package br.pr.senaccadastros.modeltable;

import br.pr.senaccadastros.model.Cidade;
import br.pr.senaccadastros.model.Estado;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

@SuppressWarnings("serial")
public class PesquisarCidadeModelTable extends AbstractTableModel {

    private Vector<Vector<Object>> linhas = new Vector<Vector<Object>>();
    private Vector<String> colunas = new Vector<String>();
    private List<Cidade> lista;

    public PesquisarCidadeModelTable() {
        init();
    }

    public PesquisarCidadeModelTable(Vector<String> colunas) {
        this.colunas = colunas;
    }

    private void init() {
        colunas.add("Código");
        colunas.add("Nome");
        colunas.add("Estado");
    }

    public int getColumnCount() {
        return colunas.size();
    }

    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public String getColumnName(int pos) {
        return colunas.get(pos);
    }

    public Object getValueAt(int l, int c) {
        return linhas.get(l).get(c);
    }

    public Cidade getAt(int l) {
        return lista.get(l);
    }

    public void removeAt(int l) {
        lista.remove(l);
        renderGrid();
    }

    public void removeAll() {
        lista = new ArrayList<Cidade>();
        renderGrid();
    }

    public void add(Cidade cidade) {
        if (lista == null) {
            lista = new ArrayList<Cidade>();
        }
        lista.add(cidade);
        renderGrid();
    }

    public void update(Cidade cidade) {

        for (Cidade cidadeAux : lista) {
            if (cidadeAux.getCodigoCidade().equals(cidade.getCodigoCidade())) {
                cidadeAux.setNomeCidade(cidade.getNomeCidade());
                cidadeAux.setEstado(cidade.getEstado());
                break;
            }
        }
        renderGrid();
    }

    public void setGridBusca(List<Cidade> lista) {
        this.lista = new ArrayList<Cidade>();
        this.lista.addAll(lista);
        renderGrid();
    }

    public void renderGrid() {
        linhas = new Vector<Vector<Object>>();
        for (Cidade cidade : lista) {

            Vector<Object> linha = new Vector<Object>();
            linha.add(cidade.getCodigoCidade());
            linha.add(cidade.getNomeCidade());
            linha.add(cidade.getEstado().getNomeEstado());
            linhas.add(linha);
        }
    }
}
