package me.jordanplayz158.utils;

import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ExcludeFileFilter;
import net.lingala.zip4j.model.ZipParameters;

import java.io.File;
import java.util.List;

public class createZip {
    public static void createZip(String zipName, File directoryToCompress, List<File> filesToExclude) throws ZipException {
        ExcludeFileFilter excludeFileFilter = filesToExclude::contains;
        ZipParameters zipParameters = new ZipParameters();
        zipParameters.setExcludeFileFilter(excludeFileFilter);

        new ZipFile(zipName).addFolder(directoryToCompress, zipParameters);
    }
}
