package it.redhat.infinispan.spi;

import org.infinispan.factories.components.ModuleMetadataFileFinder;

public class ModuleMetadataFileFinderPlayground implements ModuleMetadataFileFinder{

    @Override
    public String getMetadataFilename() {
        return "JDGPlayground-component-metadata.dat";
    }
}
