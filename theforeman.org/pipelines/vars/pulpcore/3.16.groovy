def pulpcore_version = '3.16'
def pulpcore_distros = ['el7', 'el8']
def packaging_branch = 'rpm/3.16'
def pipelines = [
    'pulpcore': [
        'centos7',
        'centos8-stream'
    ]
]
def stage_source = 'koji'
