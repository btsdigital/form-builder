## Documentation

Documentation deployed on [project page](https://btsdigital.github.io/form-builder)

## Contribution
To contribute to documentation please follow the instructions:
1) [Create issue](https://help.github.com/en/articles/creating-an-issue) or assign to yourself. 
Label the issue with `documentation`
2) [Create branch](https://help.github.com/en/articles/creating-and-deleting-branches-within-your-repository) for the issue.
Name it documentation/ISSUE_NUMBER-DESCRIPTION
3) [Create](#Create documentation page) or edit documentation page
4) Check locally. Run from `/docs` directory
    ```
   jekyll serve
    ```
5) Commit your changes to remote branch
6) [Create pull request](https://help.github.com/en/articles/creating-a-pull-request) to master
 

### Create documentation page

To create new documentation page follow the instructions:
1) Add page reference to [menu](https://github.com/btsdigital/form-builder/blob/master/docs/_data/sidebars/home_sidebar.yml)
    ```
    entries:
    - title: Sidebar
      levels: two
      folders:
      - title: Model
        output: web
        folderitems:
        - title: Catalog
          url: /Catalog.html
          output: web
        - title: NEW_PAGE_TITLE
          url: /NEW_PAGE_FILE_NAME.html
          output: web
    ```
2) Add page to [pages directory](https://github.com/btsdigital/form-builder/tree/master/docs/pages) `/docs/pages`.
For `model` pages use [corresponding](https://github.com/btsdigital/form-builder/tree/master/docs/pages/model) directory `/docs/pages/model`
Page file should have .md extension and should be written using markdown syntax

See [Catalog.md](https://github.com/btsdigital/form-builder/blob/master/docs/pages/model/Catalog.md) for example
