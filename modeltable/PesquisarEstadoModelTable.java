package br.pr.senaccadastros.modeltable;

import br.pr.senaccadastros.model.Estado;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

@SuppressWarnings("serial")
public class PesquisarEstadoModelTable extends AbstractTableModel {

    private Vector<Vector<Object>> linhas = new Vector<Vector<Object>>();
    private Vector<String> colunas = new Vector<String>();
    private List<Estado> lista;

    public PesquisarEstadoModelTable() {
        init();
    }

    public PesquisarEstadoModelTable(Vector<String> colunas) {
        this.colunas = colunas;
    }

    private void init() {
        colunas.add("Código");
        colunas.add("Nome");
        colunas.add("Sigla");
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

    public Estado getAt(int l) {
        return lista.get(l);
    }

    public void removeAt(int l) {
        lista.remove(l);
        renderGrid();
    }

    public void removeAll() {
        lista = new ArrayList<Estado>();

        renderGrid();
    }

    public void add(Estado estado) {
        if (lista == null) {
            lista = new ArrayList<Estado>();
        }

        lista.add(estado);
        renderGrid();
    }

    public void update(Estado estado) {
        for (Estado estadoAux : lista) {
            if (estadoAux.getCodigoEstado().equals(estadoAux.getCodigoEstado())) {
                estadoAux.setNomeEstado(estado.getNomeEstado());
                break;
            }
        }
        renderGrid();
    }

    public void setGridBusca(List<Estado> lista) {
        this.lista = new ArrayList<Estado>();
        this.lista.addAll(lista);
        renderGrid();
    }

    public void renderGrid() {
        linhas = new Vector<Vector<Object>>();
        for (Estado estado : lista) {

            Vector<Object> linha = new Vector<Object>();
            linha.add(estado.getCodigoEstado());
            linha.add(estado.getNomeEstado());
            linha.add(estado.getSiglaEstado());
            linhas.add(linha);
        }
    }
}
