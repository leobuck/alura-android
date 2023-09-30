package com.buck.agenda;

import android.app.Application;

import com.buck.agenda.dao.AlunoDAO;
import com.buck.agenda.model.Aluno;

public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();
    }

    private void criaAlunosDeTeste() {
        AlunoDAO dao = new AlunoDAO();
        dao.salva(new Aluno("Ana", "19999999999", "ana@email.com"));
        dao.salva(new Aluno("João", "19999999998", "joao@email.com"));
    }
}
