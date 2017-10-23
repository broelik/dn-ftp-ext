<?php
namespace develnext\bundle\ftp;

use ide\bundle\AbstractBundle;
use ide\bundle\AbstractJarBundle;
use ide\project\behaviours\GuiFrameworkProjectBehaviour;
use ide\project\Project;
/**
 * Class BroelikBundle
 */
class FTPBundle extends AbstractJarBundle
{
    public function isAvailable(Project $project)
    {
        return $project->hasBehaviour(GuiFrameworkProjectBehaviour::class);
    }
}