package com.bluecirclesquare.www.projecthelper;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluecirclesquare.www.projecthelper.model.entity.JobItems;

import java.util.List;


public class JobFragment extends Fragment {

    private RecyclerView jobRecyclerView;
    private JobAdapter jAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.list_job_items, container, false);

        jobRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_job);
        jobRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    private void UI(){
        JobItems jobItems = JobItems.get(getActivity());
        List<Job> jobs = jobItems.getJobs();

        jAdapter = new JobAdapter(jobs);
        jobRecyclerView.setAdapter(jAdapter);
        }
    private class JobHolder extends RecyclerView.ViewHolder {
        public JobHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_job_items, parent, false));
        }
    }
    private class JobAdapter extends RecyclerView.Adapter<JobHolder> {
        private List<Job> jobs;

        public JobAdapter(List<Job> jobs){
            jobs = jobs;
    }
    }
}
