
#### generate package
python38 setup.py sdist
python38 setup.py install

twine upload dist/*


#### Ref
https://packaging.python.org/tutorials/packaging-projects/
https://python-packaging.readthedocs.io/en/latest/everything.html